package org.example.tp3desamouhhajar.llm;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LlmClientForGuideTouristique {

    private final GuideTouristique guideTouristique;

    public LlmClientForGuideTouristique() {
        String apiKey = System.getenv("GEMINI_KEY");

        ChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gemini-3.5-flash")
                .responseFormat(ResponseFormat.JSON)
                .build();

        this.guideTouristique = AiServices.create(GuideTouristique.class, model);
    }

    public String guide(String lieu) {
        return guideTouristique.guide(lieu);
    }
}