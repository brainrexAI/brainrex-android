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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ExchangeAssetsResponseInner {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("tradinSym")
  private String tradinSym = null;
  @SerializedName("symbol")
  private String symbol = null;

  /**
   * Highest price of the time frame with two decimal points
   **/
  @ApiModelProperty(value = "Highest price of the time frame with two decimal points")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Percetange change in the last 24 hours
   **/
  @ApiModelProperty(value = "Percetange change in the last 24 hours")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   * Volume of currency exchanged in the time frame with two decimal points
   **/
  @ApiModelProperty(value = "Volume of currency exchanged in the time frame with two decimal points")
  public String getTradinSym() {
    return tradinSym;
  }
  public void setTradinSym(String tradinSym) {
    this.tradinSym = tradinSym;
  }

  /**
   * Volume of currency exchanged in the time frame with two decimal points
   **/
  @ApiModelProperty(value = "Volume of currency exchanged in the time frame with two decimal points")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeAssetsResponseInner exchangeAssetsResponseInner = (ExchangeAssetsResponseInner) o;
    return (this.name == null ? exchangeAssetsResponseInner.name == null : this.name.equals(exchangeAssetsResponseInner.name)) &&
        (this.id == null ? exchangeAssetsResponseInner.id == null : this.id.equals(exchangeAssetsResponseInner.id)) &&
        (this.tradinSym == null ? exchangeAssetsResponseInner.tradinSym == null : this.tradinSym.equals(exchangeAssetsResponseInner.tradinSym)) &&
        (this.symbol == null ? exchangeAssetsResponseInner.symbol == null : this.symbol.equals(exchangeAssetsResponseInner.symbol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.tradinSym == null ? 0: this.tradinSym.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeAssetsResponseInner {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tradinSym: ").append(tradinSym).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}