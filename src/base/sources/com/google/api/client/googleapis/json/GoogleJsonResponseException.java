package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Strings;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleJsonResponseException extends HttpResponseException {
    private static final long serialVersionUID = 409811126989994864L;
    private final transient GoogleJsonError details;

    public GoogleJsonResponseException(HttpResponseException.Builder builder, GoogleJsonError googleJsonError) {
        super(builder);
        this.details = googleJsonError;
    }

    public static HttpResponse execute(JsonFactory jsonFactory, HttpRequest httpRequest) throws IOException {
        Preconditions.checkNotNull(jsonFactory);
        boolean throwExceptionOnExecuteError = httpRequest.getThrowExceptionOnExecuteError();
        if (throwExceptionOnExecuteError) {
            httpRequest.setThrowExceptionOnExecuteError(false);
        }
        HttpResponse httpResponseExecute = httpRequest.execute();
        httpRequest.setThrowExceptionOnExecuteError(throwExceptionOnExecuteError);
        if (!throwExceptionOnExecuteError || httpResponseExecute.isSuccessStatusCode()) {
            return httpResponseExecute;
        }
        throw from(jsonFactory, httpResponseExecute);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7 A[Catch: IOException -> 0x0096, TryCatch #5 {IOException -> 0x0096, blocks: (B:51:0x00a7, B:53:0x00ae, B:52:0x00ab, B:42:0x0092, B:46:0x009c), top: B:66:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab A[Catch: IOException -> 0x0096, TryCatch #5 {IOException -> 0x0096, blocks: (B:51:0x00a7, B:53:0x00ae, B:52:0x00ab, B:42:0x0092, B:46:0x009c), top: B:66:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2 A[Catch: IOException -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00af, blocks: (B:3:0x0015, B:5:0x001b, B:7:0x0027, B:56:0x00b2), top: B:69:0x0015 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.api.client.googleapis.json.GoogleJsonError] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static GoogleJsonResponseException from(JsonFactory jsonFactory, HttpResponse httpResponse) throws Throwable {
        String asString;
        JsonParser jsonParserCreateJsonParser;
        GoogleJsonError googleJsonError;
        HttpResponseException.Builder builder = new HttpResponseException.Builder(httpResponse.getStatusCode(), httpResponse.getStatusMessage(), httpResponse.getHeaders());
        Preconditions.checkNotNull(jsonFactory);
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        try {
            if (httpResponse.isSuccessStatusCode()) {
                asString = httpResponse.parseAsString();
            } else {
                String contentType = httpResponse.getContentType();
                if (HttpMediaType.equalsIgnoreParameters(Json.MEDIA_TYPE, contentType)) {
                    try {
                        if (httpResponse.getContent() != null) {
                            try {
                                jsonParserCreateJsonParser = jsonFactory.createJsonParser(httpResponse.getContent());
                                try {
                                    JsonToken currentToken = jsonParserCreateJsonParser.getCurrentToken();
                                    if (currentToken == null) {
                                        currentToken = jsonParserCreateJsonParser.nextToken();
                                    }
                                    if (currentToken != null) {
                                        jsonParserCreateJsonParser.skipToKey("error");
                                        if (jsonParserCreateJsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
                                            asString = jsonParserCreateJsonParser.getText();
                                        } else if (jsonParserCreateJsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                                            GoogleJsonError googleJsonError2 = (GoogleJsonError) jsonParserCreateJsonParser.parseAndClose(GoogleJsonError.class);
                                            try {
                                                asString = googleJsonError2.toPrettyString();
                                                r10 = googleJsonError2;
                                            } catch (IOException e10) {
                                                googleJsonError = googleJsonError2;
                                                e = e10;
                                                try {
                                                    e.printStackTrace();
                                                    if (jsonParserCreateJsonParser == null) {
                                                        httpResponse.ignore();
                                                    } else if (googleJsonError == null) {
                                                        jsonParserCreateJsonParser.close();
                                                    }
                                                    asString = null;
                                                    r10 = googleJsonError;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (jsonParserCreateJsonParser != null) {
                                                        httpResponse.ignore();
                                                    } else if (googleJsonError == null) {
                                                        jsonParserCreateJsonParser.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                googleJsonError = googleJsonError2;
                                                th = th3;
                                                if (jsonParserCreateJsonParser != null) {
                                                    httpResponse.ignore();
                                                } else if (googleJsonError == null) {
                                                    jsonParserCreateJsonParser.close();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            asString = null;
                                        }
                                    } else {
                                        asString = null;
                                    }
                                    if (r10 == 0) {
                                        try {
                                            jsonParserCreateJsonParser.close();
                                        } catch (IOException e11) {
                                            e = e11;
                                            e.printStackTrace();
                                        }
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    googleJsonError = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    googleJsonError = null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                jsonParserCreateJsonParser = null;
                                googleJsonError = null;
                            } catch (Throwable th5) {
                                th = th5;
                                jsonParserCreateJsonParser = null;
                                googleJsonError = null;
                            }
                        } else {
                            asString = httpResponse.parseAsString();
                        }
                    } catch (IOException e14) {
                        e = e14;
                        asString = null;
                        r10 = contentType;
                    }
                } else {
                    asString = httpResponse.parseAsString();
                }
            }
        } catch (IOException e15) {
            e = e15;
            asString = null;
        }
        StringBuilder sbComputeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
        if (!Strings.isNullOrEmpty(asString)) {
            sbComputeMessageBuffer.append(StringUtils.LINE_SEPARATOR);
            sbComputeMessageBuffer.append(asString);
            builder.setContent(asString);
        }
        builder.setMessage(sbComputeMessageBuffer.toString());
        return new GoogleJsonResponseException(builder, r10);
    }

    public final GoogleJsonError getDetails() {
        return this.details;
    }
}
