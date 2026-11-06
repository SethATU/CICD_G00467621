package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Min(2)
    @Max(60)
    String orgName;

    @Positive
    Long attendanceCount;

    Long RoomId;
    Boolean status;

    public Booking() {}

    public Booking(Long id, String orgName, Long attendanceCount, Long RoomId, Boolean status) {
        this.id = id;
        this.orgName = orgName;
        this.attendanceCount = attendanceCount;
        this.RoomId = RoomId;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { this.orgName = orgName; }

    public Long getAttendanceCount() { return attendanceCount; }
    public void setAttendanceCount(Long attendanceCount) { this.attendanceCount = attendanceCount; }

    public Long getRoomId() { return RoomId; }
    public void setRoomId(Long RoomId) { this.RoomId = RoomId; }

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
}
