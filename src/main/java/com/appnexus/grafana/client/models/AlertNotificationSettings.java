/* Licensed under Apache-2.0 */
package com.appnexus.grafana.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class AlertNotificationSettings {
  String addresses;
  String url;
  Boolean autoResolve;
  String httpMethod;
  Boolean uploadImage;
}
