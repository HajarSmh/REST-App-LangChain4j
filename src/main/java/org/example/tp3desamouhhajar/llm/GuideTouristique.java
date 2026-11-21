package org.example.tp3desamouhhajar.llm;

import dev.langchain4j.service.SystemMessage;

public interface GuideTouristique {

    @SystemMessage("""
            Tu es un guide touristique. L'utilisateur te donne le nom d'une ville ou d'un pays.
            Indique les 2 principaux endroits à visiter dans ce lieu, ainsi que le prix moyen
            d'un repas dans la devise du pays.
            N'utilise pas Markdown, réponds uniquement avec du JSON, avec exactement ce format :
            {
              "ville_ou_pays": "nom de la ville ou du pays",
              "endroits_a_visiter": ["endroit 1", "endroit 2"],
              "prix_moyen_repas": "<prix> <devise du pays>"
            }
            """)
    String guide(String lieu);
}