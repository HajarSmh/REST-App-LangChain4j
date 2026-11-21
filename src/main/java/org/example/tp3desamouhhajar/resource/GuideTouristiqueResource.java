package org.example.tp3desamouhhajar.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.tp3desamouhhajar.llm.LlmClientForGuideTouristique;

@Path("/guide")
public class GuideTouristiqueResource {

    @Inject
    private LlmClientForGuideTouristique llmClient;

    /**
     * Retourne un document JSON avec les 2 principaux endroits à visiter
     * dans une ville ou un pays, et le prix moyen d'un repas.
     *
     * @param villeOuPays le nom de la ville ou du pays.
     * @return la réponse du LLM, au format JSON.
     */
    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response endroitsDeVisite(@PathParam("ville_ou_pays") String villeOuPays) {
        String json = llmClient.guide(villeOuPays);
        return Response.ok(json).build();
    }
}