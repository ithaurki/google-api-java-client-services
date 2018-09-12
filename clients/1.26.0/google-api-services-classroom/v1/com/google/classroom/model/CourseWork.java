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

package com.google.classroom.model;

/**
 * Course work created by a teacher for students of the course.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CourseWork extends com.google.api.client.json.GenericJson {

  /**
   * Absolute link to this course work in the Classroom web UI. This is only populated if `state` is
   * `PUBLISHED`.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateLink;

  /**
   * Assignee mode of the coursework. If unspecified, the default value is `ALL_STUDENTS`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assigneeMode;

  /**
   * Assignment details. This is populated only when `work_type` is `ASSIGNMENT`.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Assignment assignment;

  /**
   * Whether this course work item is associated with the Developer Console project making the
   * request.
   *
   * See google.classroom.Work.CreateCourseWork for more details.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean associatedWithDeveloper;

  /**
   * Identifier of the course.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String courseId;

  /**
   * Timestamp when this course work was created.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String creationTime;

  /**
   * Identifier for the user that created the coursework.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creatorUserId;

  /**
   * Optional description of this course work. If set, the description must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional date, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_time` is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date dueDate;

  /**
   * Optional time of day, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_date` is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay dueTime;

  /**
   * Classroom-assigned identifier of this course work, unique per course.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifiers of students with access to the coursework. This field is set only if `assigneeMode`
   * is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
   * specified in this field will be assigned the coursework.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndividualStudentsOptions individualStudentsOptions;

  /**
   * Additional materials.
   *
   * CourseWork must have no more than 20 material items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Material> materials;

  /**
   * Maximum grade for this course work. If zero or unspecified, this assignment is considered
   * ungraded. This must be a non-negative integer value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxPoints;

  /**
   * Multiple choice question details. For read operations, this field is populated only when
   * `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write operations, this field must be specified
   * when creating course work with a `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be
   * set otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultipleChoiceQuestion multipleChoiceQuestion;

  /**
   * Optional timestamp when this course work is scheduled to be published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledTime;

  /**
   * Status of this course work. If unspecified, the default state is `DRAFT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Setting to determine when students are allowed to modify submissions. If unspecified, the
   * default value is `MODIFIABLE_UNTIL_TURNED_IN`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String submissionModificationMode;

  /**
   * Title of this course work. The title must be a valid UTF-8 string containing between 1 and 3000
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Timestamp of the most recent change to this course work.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Type of this course work.
   *
   * The type is set when the course work is created and cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workType;

  /**
   * Absolute link to this course work in the Classroom web UI. This is only populated if `state` is
   * `PUBLISHED`.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateLink() {
    return alternateLink;
  }

  /**
   * Absolute link to this course work in the Classroom web UI. This is only populated if `state` is
   * `PUBLISHED`.
   *
   * Read-only.
   * @param alternateLink alternateLink or {@code null} for none
   */
  public CourseWork setAlternateLink(java.lang.String alternateLink) {
    this.alternateLink = alternateLink;
    return this;
  }

  /**
   * Assignee mode of the coursework. If unspecified, the default value is `ALL_STUDENTS`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssigneeMode() {
    return assigneeMode;
  }

  /**
   * Assignee mode of the coursework. If unspecified, the default value is `ALL_STUDENTS`.
   * @param assigneeMode assigneeMode or {@code null} for none
   */
  public CourseWork setAssigneeMode(java.lang.String assigneeMode) {
    this.assigneeMode = assigneeMode;
    return this;
  }

  /**
   * Assignment details. This is populated only when `work_type` is `ASSIGNMENT`.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public Assignment getAssignment() {
    return assignment;
  }

  /**
   * Assignment details. This is populated only when `work_type` is `ASSIGNMENT`.
   *
   * Read-only.
   * @param assignment assignment or {@code null} for none
   */
  public CourseWork setAssignment(Assignment assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * Whether this course work item is associated with the Developer Console project making the
   * request.
   *
   * See google.classroom.Work.CreateCourseWork for more details.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAssociatedWithDeveloper() {
    return associatedWithDeveloper;
  }

  /**
   * Whether this course work item is associated with the Developer Console project making the
   * request.
   *
   * See google.classroom.Work.CreateCourseWork for more details.
   *
   * Read-only.
   * @param associatedWithDeveloper associatedWithDeveloper or {@code null} for none
   */
  public CourseWork setAssociatedWithDeveloper(java.lang.Boolean associatedWithDeveloper) {
    this.associatedWithDeveloper = associatedWithDeveloper;
    return this;
  }

  /**
   * Identifier of the course.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCourseId() {
    return courseId;
  }

  /**
   * Identifier of the course.
   *
   * Read-only.
   * @param courseId courseId or {@code null} for none
   */
  public CourseWork setCourseId(java.lang.String courseId) {
    this.courseId = courseId;
    return this;
  }

  /**
   * Timestamp when this course work was created.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Timestamp when this course work was created.
   *
   * Read-only.
   * @param creationTime creationTime or {@code null} for none
   */
  public CourseWork setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Identifier for the user that created the coursework.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreatorUserId() {
    return creatorUserId;
  }

  /**
   * Identifier for the user that created the coursework.
   *
   * Read-only.
   * @param creatorUserId creatorUserId or {@code null} for none
   */
  public CourseWork setCreatorUserId(java.lang.String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  /**
   * Optional description of this course work. If set, the description must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional description of this course work. If set, the description must be a valid UTF-8 string
   * containing no more than 30,000 characters.
   * @param description description or {@code null} for none
   */
  public CourseWork setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional date, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_time` is specified.
   * @return value or {@code null} for none
   */
  public Date getDueDate() {
    return dueDate;
  }

  /**
   * Optional date, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_time` is specified.
   * @param dueDate dueDate or {@code null} for none
   */
  public CourseWork setDueDate(Date dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Optional time of day, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_date` is specified.
   * @return value or {@code null} for none
   */
  public TimeOfDay getDueTime() {
    return dueTime;
  }

  /**
   * Optional time of day, in UTC, that submissions for this this course work are due. This must be
   * specified if `due_date` is specified.
   * @param dueTime dueTime or {@code null} for none
   */
  public CourseWork setDueTime(TimeOfDay dueTime) {
    this.dueTime = dueTime;
    return this;
  }

  /**
   * Classroom-assigned identifier of this course work, unique per course.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Classroom-assigned identifier of this course work, unique per course.
   *
   * Read-only.
   * @param id id or {@code null} for none
   */
  public CourseWork setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifiers of students with access to the coursework. This field is set only if `assigneeMode`
   * is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
   * specified in this field will be assigned the coursework.
   * @return value or {@code null} for none
   */
  public IndividualStudentsOptions getIndividualStudentsOptions() {
    return individualStudentsOptions;
  }

  /**
   * Identifiers of students with access to the coursework. This field is set only if `assigneeMode`
   * is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students
   * specified in this field will be assigned the coursework.
   * @param individualStudentsOptions individualStudentsOptions or {@code null} for none
   */
  public CourseWork setIndividualStudentsOptions(IndividualStudentsOptions individualStudentsOptions) {
    this.individualStudentsOptions = individualStudentsOptions;
    return this;
  }

  /**
   * Additional materials.
   *
   * CourseWork must have no more than 20 material items.
   * @return value or {@code null} for none
   */
  public java.util.List<Material> getMaterials() {
    return materials;
  }

  /**
   * Additional materials.
   *
   * CourseWork must have no more than 20 material items.
   * @param materials materials or {@code null} for none
   */
  public CourseWork setMaterials(java.util.List<Material> materials) {
    this.materials = materials;
    return this;
  }

  /**
   * Maximum grade for this course work. If zero or unspecified, this assignment is considered
   * ungraded. This must be a non-negative integer value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxPoints() {
    return maxPoints;
  }

  /**
   * Maximum grade for this course work. If zero or unspecified, this assignment is considered
   * ungraded. This must be a non-negative integer value.
   * @param maxPoints maxPoints or {@code null} for none
   */
  public CourseWork setMaxPoints(java.lang.Double maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }

  /**
   * Multiple choice question details. For read operations, this field is populated only when
   * `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write operations, this field must be specified
   * when creating course work with a `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be
   * set otherwise.
   * @return value or {@code null} for none
   */
  public MultipleChoiceQuestion getMultipleChoiceQuestion() {
    return multipleChoiceQuestion;
  }

  /**
   * Multiple choice question details. For read operations, this field is populated only when
   * `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write operations, this field must be specified
   * when creating course work with a `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be
   * set otherwise.
   * @param multipleChoiceQuestion multipleChoiceQuestion or {@code null} for none
   */
  public CourseWork setMultipleChoiceQuestion(MultipleChoiceQuestion multipleChoiceQuestion) {
    this.multipleChoiceQuestion = multipleChoiceQuestion;
    return this;
  }

  /**
   * Optional timestamp when this course work is scheduled to be published.
   * @return value or {@code null} for none
   */
  public String getScheduledTime() {
    return scheduledTime;
  }

  /**
   * Optional timestamp when this course work is scheduled to be published.
   * @param scheduledTime scheduledTime or {@code null} for none
   */
  public CourseWork setScheduledTime(String scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

  /**
   * Status of this course work. If unspecified, the default state is `DRAFT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Status of this course work. If unspecified, the default state is `DRAFT`.
   * @param state state or {@code null} for none
   */
  public CourseWork setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Setting to determine when students are allowed to modify submissions. If unspecified, the
   * default value is `MODIFIABLE_UNTIL_TURNED_IN`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubmissionModificationMode() {
    return submissionModificationMode;
  }

  /**
   * Setting to determine when students are allowed to modify submissions. If unspecified, the
   * default value is `MODIFIABLE_UNTIL_TURNED_IN`.
   * @param submissionModificationMode submissionModificationMode or {@code null} for none
   */
  public CourseWork setSubmissionModificationMode(java.lang.String submissionModificationMode) {
    this.submissionModificationMode = submissionModificationMode;
    return this;
  }

  /**
   * Title of this course work. The title must be a valid UTF-8 string containing between 1 and 3000
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of this course work. The title must be a valid UTF-8 string containing between 1 and 3000
   * characters.
   * @param title title or {@code null} for none
   */
  public CourseWork setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Timestamp of the most recent change to this course work.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Timestamp of the most recent change to this course work.
   *
   * Read-only.
   * @param updateTime updateTime or {@code null} for none
   */
  public CourseWork setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Type of this course work.
   *
   * The type is set when the course work is created and cannot be changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkType() {
    return workType;
  }

  /**
   * Type of this course work.
   *
   * The type is set when the course work is created and cannot be changed.
   * @param workType workType or {@code null} for none
   */
  public CourseWork setWorkType(java.lang.String workType) {
    this.workType = workType;
    return this;
  }

  @Override
  public CourseWork set(String fieldName, Object value) {
    return (CourseWork) super.set(fieldName, value);
  }

  @Override
  public CourseWork clone() {
    return (CourseWork) super.clone();
  }

}
