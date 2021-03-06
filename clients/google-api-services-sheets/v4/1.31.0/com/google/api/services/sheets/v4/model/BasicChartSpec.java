/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.sheets.v4.model;

/**
 * The specification for a basic chart. See BasicChartType for the list of charts this supports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The axis on the chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BasicChartAxis> axis;

  static {
    // hack to force ProGuard to consider BasicChartAxis used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BasicChartAxis.class);
  }

  /**
   * The type of the chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chartType;

  /**
   * The behavior of tooltips and data highlighting when hovering on data and chart area.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compareMode;

  /**
   * The domain of data this is charting. Only a single domain is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BasicChartDomain> domains;

  static {
    // hack to force ProGuard to consider BasicChartDomain used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BasicChartDomain.class);
  }

  /**
   * The number of rows or columns in the data that are "headers". If not set, Google Sheets will
   * guess how many rows are headers based on the data. (Note that BasicChartAxis.title may override
   * the axis title inferred from the header values.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer headerCount;

  /**
   * If some values in a series are missing, gaps may appear in the chart (e.g, segments of lines in
   * a line chart will be missing). To eliminate these gaps set this to true. Applies to Line, Area,
   * and Combo charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean interpolateNulls;

  /**
   * The position of the chart legend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String legendPosition;

  /**
   * Gets whether all lines should be rendered smooth or straight by default. Applies to Line
   * charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lineSmoothing;

  /**
   * The data this chart is visualizing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BasicChartSeries> series;

  static {
    // hack to force ProGuard to consider BasicChartSeries used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BasicChartSeries.class);
  }

  /**
   * The stacked type for charts that support vertical stacking. Applies to Area, Bar, Column,
   * Combo, and Stepped Area charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stackedType;

  /**
   * True to make the chart 3D. Applies to Bar and Column charts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean threeDimensional;

  /**
   * Controls whether to display additional data labels on stacked charts which sum the total value
   * of all stacked values at each value along the domain axis. These data labels can only be set
   * when chart_type is one of AREA, BAR, COLUMN, COMBO or STEPPED_AREA and stacked_type is either
   * STACKED or PERCENT_STACKED. In addition, for COMBO, this will only be supported if there is
   * only one type of stackable series type or one type has more series than the others and each of
   * the other types have no more than one series. For example, if a chart has two stacked bar
   * series and one area series, the total data labels will be supported. If it has three bar series
   * and two area series, total data labels are not allowed. Neither CUSTOM nor placement can be set
   * on the total_data_label.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataLabel totalDataLabel;

  /**
   * The axis on the chart.
   * @return value or {@code null} for none
   */
  public java.util.List<BasicChartAxis> getAxis() {
    return axis;
  }

  /**
   * The axis on the chart.
   * @param axis axis or {@code null} for none
   */
  public BasicChartSpec setAxis(java.util.List<BasicChartAxis> axis) {
    this.axis = axis;
    return this;
  }

  /**
   * The type of the chart.
   * @return value or {@code null} for none
   */
  public java.lang.String getChartType() {
    return chartType;
  }

  /**
   * The type of the chart.
   * @param chartType chartType or {@code null} for none
   */
  public BasicChartSpec setChartType(java.lang.String chartType) {
    this.chartType = chartType;
    return this;
  }

  /**
   * The behavior of tooltips and data highlighting when hovering on data and chart area.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompareMode() {
    return compareMode;
  }

  /**
   * The behavior of tooltips and data highlighting when hovering on data and chart area.
   * @param compareMode compareMode or {@code null} for none
   */
  public BasicChartSpec setCompareMode(java.lang.String compareMode) {
    this.compareMode = compareMode;
    return this;
  }

  /**
   * The domain of data this is charting. Only a single domain is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<BasicChartDomain> getDomains() {
    return domains;
  }

  /**
   * The domain of data this is charting. Only a single domain is supported.
   * @param domains domains or {@code null} for none
   */
  public BasicChartSpec setDomains(java.util.List<BasicChartDomain> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * The number of rows or columns in the data that are "headers". If not set, Google Sheets will
   * guess how many rows are headers based on the data. (Note that BasicChartAxis.title may override
   * the axis title inferred from the header values.)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeaderCount() {
    return headerCount;
  }

  /**
   * The number of rows or columns in the data that are "headers". If not set, Google Sheets will
   * guess how many rows are headers based on the data. (Note that BasicChartAxis.title may override
   * the axis title inferred from the header values.)
   * @param headerCount headerCount or {@code null} for none
   */
  public BasicChartSpec setHeaderCount(java.lang.Integer headerCount) {
    this.headerCount = headerCount;
    return this;
  }

  /**
   * If some values in a series are missing, gaps may appear in the chart (e.g, segments of lines in
   * a line chart will be missing). To eliminate these gaps set this to true. Applies to Line, Area,
   * and Combo charts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInterpolateNulls() {
    return interpolateNulls;
  }

  /**
   * If some values in a series are missing, gaps may appear in the chart (e.g, segments of lines in
   * a line chart will be missing). To eliminate these gaps set this to true. Applies to Line, Area,
   * and Combo charts.
   * @param interpolateNulls interpolateNulls or {@code null} for none
   */
  public BasicChartSpec setInterpolateNulls(java.lang.Boolean interpolateNulls) {
    this.interpolateNulls = interpolateNulls;
    return this;
  }

  /**
   * The position of the chart legend.
   * @return value or {@code null} for none
   */
  public java.lang.String getLegendPosition() {
    return legendPosition;
  }

  /**
   * The position of the chart legend.
   * @param legendPosition legendPosition or {@code null} for none
   */
  public BasicChartSpec setLegendPosition(java.lang.String legendPosition) {
    this.legendPosition = legendPosition;
    return this;
  }

  /**
   * Gets whether all lines should be rendered smooth or straight by default. Applies to Line
   * charts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLineSmoothing() {
    return lineSmoothing;
  }

  /**
   * Gets whether all lines should be rendered smooth or straight by default. Applies to Line
   * charts.
   * @param lineSmoothing lineSmoothing or {@code null} for none
   */
  public BasicChartSpec setLineSmoothing(java.lang.Boolean lineSmoothing) {
    this.lineSmoothing = lineSmoothing;
    return this;
  }

  /**
   * The data this chart is visualizing.
   * @return value or {@code null} for none
   */
  public java.util.List<BasicChartSeries> getSeries() {
    return series;
  }

  /**
   * The data this chart is visualizing.
   * @param series series or {@code null} for none
   */
  public BasicChartSpec setSeries(java.util.List<BasicChartSeries> series) {
    this.series = series;
    return this;
  }

  /**
   * The stacked type for charts that support vertical stacking. Applies to Area, Bar, Column,
   * Combo, and Stepped Area charts.
   * @return value or {@code null} for none
   */
  public java.lang.String getStackedType() {
    return stackedType;
  }

  /**
   * The stacked type for charts that support vertical stacking. Applies to Area, Bar, Column,
   * Combo, and Stepped Area charts.
   * @param stackedType stackedType or {@code null} for none
   */
  public BasicChartSpec setStackedType(java.lang.String stackedType) {
    this.stackedType = stackedType;
    return this;
  }

  /**
   * True to make the chart 3D. Applies to Bar and Column charts.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getThreeDimensional() {
    return threeDimensional;
  }

  /**
   * True to make the chart 3D. Applies to Bar and Column charts.
   * @param threeDimensional threeDimensional or {@code null} for none
   */
  public BasicChartSpec setThreeDimensional(java.lang.Boolean threeDimensional) {
    this.threeDimensional = threeDimensional;
    return this;
  }

  /**
   * Controls whether to display additional data labels on stacked charts which sum the total value
   * of all stacked values at each value along the domain axis. These data labels can only be set
   * when chart_type is one of AREA, BAR, COLUMN, COMBO or STEPPED_AREA and stacked_type is either
   * STACKED or PERCENT_STACKED. In addition, for COMBO, this will only be supported if there is
   * only one type of stackable series type or one type has more series than the others and each of
   * the other types have no more than one series. For example, if a chart has two stacked bar
   * series and one area series, the total data labels will be supported. If it has three bar series
   * and two area series, total data labels are not allowed. Neither CUSTOM nor placement can be set
   * on the total_data_label.
   * @return value or {@code null} for none
   */
  public DataLabel getTotalDataLabel() {
    return totalDataLabel;
  }

  /**
   * Controls whether to display additional data labels on stacked charts which sum the total value
   * of all stacked values at each value along the domain axis. These data labels can only be set
   * when chart_type is one of AREA, BAR, COLUMN, COMBO or STEPPED_AREA and stacked_type is either
   * STACKED or PERCENT_STACKED. In addition, for COMBO, this will only be supported if there is
   * only one type of stackable series type or one type has more series than the others and each of
   * the other types have no more than one series. For example, if a chart has two stacked bar
   * series and one area series, the total data labels will be supported. If it has three bar series
   * and two area series, total data labels are not allowed. Neither CUSTOM nor placement can be set
   * on the total_data_label.
   * @param totalDataLabel totalDataLabel or {@code null} for none
   */
  public BasicChartSpec setTotalDataLabel(DataLabel totalDataLabel) {
    this.totalDataLabel = totalDataLabel;
    return this;
  }

  @Override
  public BasicChartSpec set(String fieldName, Object value) {
    return (BasicChartSpec) super.set(fieldName, value);
  }

  @Override
  public BasicChartSpec clone() {
    return (BasicChartSpec) super.clone();
  }

}
