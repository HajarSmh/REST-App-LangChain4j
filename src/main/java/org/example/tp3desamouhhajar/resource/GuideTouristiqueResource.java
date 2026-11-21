package org.example.tp3desamouhhajar.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {

    /**
     * Retourne des informations touristiques sur une ville ou un pays.
     * Pour le moment, retourne seulement la valeur du paramètre (test).
     *
     * @param villeOuPays le nom de la ville ou du pays.
     * @return la valeur du paramètre.
     */
    @GET
    @Path("lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] endroitsDeVisite(@PathParam("ville_ou_pays") String villeOuPays) {
        return new String[]{villeOuPays};
    }
}