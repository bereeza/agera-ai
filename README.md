# Agera AI

A Spring Boot application for testing OpenAI API integration and gaining hands-on experience with AI-powered conversational interfaces.

## Purpose

This project was created to:
- Test and explore OpenAI API capabilities
- Gain practical experience with AI integration in Java applications
- Implement a reactive chat interface using Spring WebFlux
- Work with LangChain4J for AI agent development

## Architecture

- **Backend**: Spring Boot 4.0.1 with Java 17
- **AI Framework**: LangChain4J 
- **Reactive Stack**: Spring WebFlux with Project Reactor
- **Frontend**: Next.js application with streaming chat interface

## Features

- RESTful API for chat interactions (`/api/v1/chat`)
- Streaming responses using NDJSON format
- Reactive programming with WebFlux
- OpenAI integration through LangChain4J

## Quick Start

### Prerequisites
- Java 17
- Maven 3.8+
- OpenAI API key

### Backend Setup

1. **Configure OpenAI API**
   - Set your OpenAI API key in `application.properties`:
   ```properties
   langchain4j.open-ai.api-key=your-openai-api-key
   ```

2. **Run with Maven**
   ```bash
   cd backend
   mvn spring-boot:run
   ```

3. **Run with Docker**
   ```bash
   cd backend
   docker build -t agera-ai-backend .
   docker run -p 8080:8080 agera-ai-backend
   ```

### Frontend Setup

1. **Install dependencies**
   ```bash
   cd frontend
   npm install
   ```

2. **Start development server**
   ```bash
   npm run dev
   ```

## API Endpoints

### Chat Endpoint
- **URL**: `POST /api/v1/chat`
- **Content-Type**: `application/json`
- **Response**: `application/x-ndjson` (streaming)

**Request Body:**
```json
{
  "request": "Some message"
}
```

**Response**: Streaming JSON lines with AI responses.

## Development Notes

This is a learning project focused on:
- Understanding AI API integration patterns
- Exploring reactive programming with streaming responses
- Building conversational interfaces

## Technologies Used

- **Spring Boot**: Application framework
- **LangChain4J**: AI integration library
- **OpenAI**: AI model provider
- **WebFlux**: Reactive web framework
- **Maven**: Build tool
- **Docker**: Containerization
