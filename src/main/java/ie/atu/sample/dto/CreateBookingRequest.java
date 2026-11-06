package ie.atu.sample.dto;

public record CreateBookingRequest(Long id, String orgName, Long attendanceCount, Long roomId, Boolean status) {
}
