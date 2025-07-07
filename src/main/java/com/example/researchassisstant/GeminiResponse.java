package com.example.researchassisstant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

//@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
//
//public class GeminiResponse {
//    private List<Candidate> candidates;
//    @Data
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Candidate {
//        private Content content;
//
//        public Content getContent() {
//            return content;
//        }
//    }
//    @Data
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Content {
//        private List<Part> parts;
//
//        public List<Part> getParts() {
//            return parts;
//        }
//    }
//    @Data
//    @JsonIgnoreProperties(ignoreUnknown = true)
//    public static class Part {
//        private String text;
//
//        public String getText() {
//            return text;
//        }
//    }
//}



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {
    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate {
        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content {
        private List<Part> parts;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part {
        private String text;
    }
}