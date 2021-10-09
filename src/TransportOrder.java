import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class TransportOrder {

    private String id;
    private String companyId;
    private String applicationId;
    private String sellerId;
    private Long externalId;
//    private PartnerPlataform partnerPlatform;
//    private Customer customer;
//    private List<OrderVolume> orderVolume;
    private String orderType;
    private String orderSubType;
    private String orderNumber;
    private String salesOrderNumber;
    private String originZipCode;
    private String estimatedDeliveryDate;
    private BigDecimal providerShippingCosts;
    private BigDecimal customerShippingCosts;
    private String salesChannel;
    private Boolean scheduled;
    private int numberAttempts;
    private List<ErrorMessage> errorMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderSubType() {
        return orderSubType;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSalesOrderNumber() {
        return salesOrderNumber;
    }

    public void setSalesOrderNumber(String salesOrderNumber) {
        this.salesOrderNumber = salesOrderNumber;
    }

    public String getOriginZipCode() {
        return originZipCode;
    }

    public void setOriginZipCode(String originZipCode) {
        this.originZipCode = originZipCode;
    }

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public BigDecimal getProviderShippingCosts() {
        return providerShippingCosts;
    }

    public void setProviderShippingCosts(BigDecimal providerShippingCosts) {
        this.providerShippingCosts = providerShippingCosts;
    }

    public BigDecimal getCustomerShippingCosts() {
        return customerShippingCosts;
    }

    public void setCustomerShippingCosts(BigDecimal customerShippingCosts) {
        this.customerShippingCosts = customerShippingCosts;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public Boolean getScheduled() {
        return scheduled;
    }

    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }

    public int getNumberAttempts() {
        return numberAttempts;
    }

    public void setNumberAttempts(int numberAttempts) {
        this.numberAttempts = numberAttempts;
    }

    public List<ErrorMessage> getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(List<ErrorMessage> errorMessage) {
        this.errorMessage = errorMessage;
    }
}
