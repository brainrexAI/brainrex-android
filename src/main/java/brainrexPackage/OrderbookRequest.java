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
public class OrderbookRequest {
  
  @SerializedName("base_trading_symbol")
  private String baseTradingSymbol = null;
  @SerializedName("exchange")
  private String exchange = null;
  @SerializedName("limit")
  private BigDecimal limit = null;
  @SerializedName("quote_trading_symbol")
  private String quoteTradingSymbol = null;

  /**
   * Name of the currency pair
   **/
  @ApiModelProperty(value = "Name of the currency pair")
  public String getBaseTradingSymbol() {
    return baseTradingSymbol;
  }
  public void setBaseTradingSymbol(String baseTradingSymbol) {
    this.baseTradingSymbol = baseTradingSymbol;
  }

  /**
   * Name of the exchange
   **/
  @ApiModelProperty(value = "Name of the exchange")
  public String getExchange() {
    return exchange;
  }
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  /**
   * Limit depth to extract from the orderbook
   **/
  @ApiModelProperty(value = "Limit depth to extract from the orderbook")
  public BigDecimal getLimit() {
    return limit;
  }
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  /**
   * Name of the data format availables (standard)
   **/
  @ApiModelProperty(value = "Name of the data format availables (standard)")
  public String getQuoteTradingSymbol() {
    return quoteTradingSymbol;
  }
  public void setQuoteTradingSymbol(String quoteTradingSymbol) {
    this.quoteTradingSymbol = quoteTradingSymbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderbookRequest orderbookRequest = (OrderbookRequest) o;
    return (this.baseTradingSymbol == null ? orderbookRequest.baseTradingSymbol == null : this.baseTradingSymbol.equals(orderbookRequest.baseTradingSymbol)) &&
        (this.exchange == null ? orderbookRequest.exchange == null : this.exchange.equals(orderbookRequest.exchange)) &&
        (this.limit == null ? orderbookRequest.limit == null : this.limit.equals(orderbookRequest.limit)) &&
        (this.quoteTradingSymbol == null ? orderbookRequest.quoteTradingSymbol == null : this.quoteTradingSymbol.equals(orderbookRequest.quoteTradingSymbol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.baseTradingSymbol == null ? 0: this.baseTradingSymbol.hashCode());
    result = 31 * result + (this.exchange == null ? 0: this.exchange.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    result = 31 * result + (this.quoteTradingSymbol == null ? 0: this.quoteTradingSymbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderbookRequest {\n");
    
    sb.append("  baseTradingSymbol: ").append(baseTradingSymbol).append("\n");
    sb.append("  exchange: ").append(exchange).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  quoteTradingSymbol: ").append(quoteTradingSymbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
