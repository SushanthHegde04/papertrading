package com.PaperTrading.Model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Stocks")
public class Stock {
	 @Id
	    @Column(name = "StockID")
	    private int stockId;
	    @Column(name = "StockSymbol")
	    private String stockSymbol;
	    @Column(name = "CurrentPrice")
	    private BigDecimal currentPrice;
	    @Column(name = "Openprice")
        private BigDecimal openprice;
		public int getStockId() {
			return stockId;
		}
		public void setStockId(int stockId) {
			this.stockId = stockId;
		}
		public String getStockSymbol() {
			return stockSymbol;
		}
		public void setStockSymbol(String stockSymbol) {
			this.stockSymbol = stockSymbol;
		}
		public BigDecimal getCurrentPrice() {
			return currentPrice;
		}
		public void setCurrentPrice(BigDecimal currentPrice) {
			this.currentPrice = currentPrice;
		}
		public BigDecimal getOpenprice() {
			return openprice;
		}
		public void setOpenprice(BigDecimal openprice) {
			this.openprice = openprice;
		}
		public Stock(int stockId, String stockSymbol, BigDecimal currentPrice, BigDecimal openprice) {
			super();
			this.stockId = stockId;
			this.stockSymbol = stockSymbol;
			this.currentPrice = currentPrice;
			this.openprice = openprice;
		}
		public Stock() {
			super();
			// TODO Auto-generated constructor stub
		}
	    



}
