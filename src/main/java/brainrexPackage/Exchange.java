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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Exchange {
  
  @SerializedName("exchange")
  private String exchange = null;

  /**
   * Name of the digital asset exchange to get data from
   **/
  @ApiModelProperty(value = "Name of the digital asset exchange to get data from")
  public String getExchange() {
    return exchange;
  }
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Exchange exchange = (Exchange) o;
    return (this.exchange == null ? exchange.exchange == null : this.exchange.equals(exchange.exchange));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.exchange == null ? 0: this.exchange.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exchange {\n");
    
    sb.append("  exchange: ").append(exchange).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
