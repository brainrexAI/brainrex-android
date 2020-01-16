/**
 * BrainRex API
 * The Brainrex API is a collection of analytics tools and data integrations made for blockchain developers. In particular we offer Natural Language Processing and Anomaly detection algorithms that have been fine tune to understand text data and time series in the domain speficic setting of cryptocurrency and blockchain technology. This technology is intended to be use as building blocks to bigger applications, we offer examples on how to use them for Trading Backtesting and Smart Contract anomaly monitoring.
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package brainrexPackage;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PointTimeSeries {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("value")
  private Float value = null;

  /**
   * Timestamp in datetime format
   **/
  @ApiModelProperty(value = "Timestamp in datetime format")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Value of the time series point
   **/
  @ApiModelProperty(value = "Value of the time series point")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointTimeSeries pointTimeSeries = (PointTimeSeries) o;
    return (this.timestamp == null ? pointTimeSeries.timestamp == null : this.timestamp.equals(pointTimeSeries.timestamp)) &&
        (this.value == null ? pointTimeSeries.value == null : this.value.equals(pointTimeSeries.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointTimeSeries {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
