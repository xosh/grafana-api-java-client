/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class DashboardPanelTargetSelect {
  List<String> params;
  Type type;
  
	public enum Type {
		FIELD("field"),
		BOTTOM("bottom"),
		FIRST("first"),
		LAST("last"),
		MAX("max"),
		MIN("min"),
		PERCENTILE("percentile"),
		TOP("top");
		private final String value;

		Type(String s) {
			value = s;
		}

		@JsonValue
		public String value() {
			return value;
		}
	}
}
