package software.ias.training.api.model;

import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;

public class ServiceReport {
    private final TechnicianId technicianId;
    private final String serviceId;
    private final LocalDateTime startDate;
    private final LocalDateTime endData;

    public ServiceReport(TechnicianId technicianId, String serviceId, LocalDateTime startDate, LocalDateTime endData) {
        this.technicianId = Validate.notNull(technicianId, "technicianId can not be null");
        this.serviceId = Validate.notNull(serviceId, "serviceId can not be null");
        this.startDate = Validate.notNull(startDate, "startDate can not be null");
        this.endData = Validate.notNull(endData, "endData can not be null");
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndData() {
        return endData;
    }

    @Override
    public String toString() {
        return "ServiceReport{" +
                "technicianId='" + technicianId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", startDate=" + startDate +
                ", endData=" + endData +
                '}';
    }
}
