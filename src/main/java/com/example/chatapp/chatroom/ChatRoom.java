package com.example.chatapp.chatroom;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "chatRoom")
public class ChatRoom {
    @Id
    private int id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
