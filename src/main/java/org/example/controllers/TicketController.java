package org.example.controllers;

import org.example.dtos.IssueTicketRequestDto;
import org.example.dtos.IssueTicketResponseDto;
import org.example.dtos.ResponseStatus;
import org.example.models.Ticket;

public class TicketController {
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        Ticket ticket = new Ticket();
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        return responseDto;
    }

}
