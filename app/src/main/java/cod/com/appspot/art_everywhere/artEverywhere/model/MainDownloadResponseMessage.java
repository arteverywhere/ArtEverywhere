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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-28 at 23:00:03 UTC 
 * Modify at your own risk.
 */

package cod.com.appspot.art_everywhere.artEverywhere.model;

/**
 * Model definition for MainDownloadResponseMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the artEverywhere. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MainDownloadResponseMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long anno;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artist;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("date_time")
  private java.lang.String dateTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String descr;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dim;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String liked;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long likes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String luogo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mese;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String technique;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnno() {
    return anno;
  }

  /**
   * @param anno anno or {@code null} for none
   */
  public MainDownloadResponseMessage setAnno(java.lang.Long anno) {
    this.anno = anno;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getArtist() {
    return artist;
  }

  /**
   * @param artist artist or {@code null} for none
   */
  public MainDownloadResponseMessage setArtist(java.lang.String artist) {
    this.artist = artist;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDateTime() {
    return dateTime;
  }

  /**
   * @param dateTime dateTime or {@code null} for none
   */
  public MainDownloadResponseMessage setDateTime(java.lang.String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescr() {
    return descr;
  }

  /**
   * @param descr descr or {@code null} for none
   */
  public MainDownloadResponseMessage setDescr(java.lang.String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDim() {
    return dim;
  }

  /**
   * @param dim dim or {@code null} for none
   */
  public MainDownloadResponseMessage setDim(java.lang.String dim) {
    this.dim = dim;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLiked() {
    return liked;
  }

  /**
   * @param liked liked or {@code null} for none
   */
  public MainDownloadResponseMessage setLiked(java.lang.String liked) {
    this.liked = liked;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getLikes() {
    return likes;
  }

  /**
   * @param likes likes or {@code null} for none
   */
  public MainDownloadResponseMessage setLikes(java.lang.Long likes) {
    this.likes = likes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLuogo() {
    return luogo;
  }

  /**
   * @param luogo luogo or {@code null} for none
   */
  public MainDownloadResponseMessage setLuogo(java.lang.String luogo) {
    this.luogo = luogo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMese() {
    return mese;
  }

  /**
   * @param mese mese or {@code null} for none
   */
  public MainDownloadResponseMessage setMese(java.lang.String mese) {
    this.mese = mese;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTechnique() {
    return technique;
  }

  /**
   * @param technique technique or {@code null} for none
   */
  public MainDownloadResponseMessage setTechnique(java.lang.String technique) {
    this.technique = technique;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public MainDownloadResponseMessage setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * @param url url or {@code null} for none
   */
  public MainDownloadResponseMessage setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public MainDownloadResponseMessage set(String fieldName, Object value) {
    return (MainDownloadResponseMessage) super.set(fieldName, value);
  }

  @Override
  public MainDownloadResponseMessage clone() {
    return (MainDownloadResponseMessage) super.clone();
  }

}
