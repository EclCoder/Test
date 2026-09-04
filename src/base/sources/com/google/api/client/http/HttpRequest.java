package com.google.api.client.http;

import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StreamingContent;
import com.google.api.client.util.StringUtils;
import com.google.common.util.concurrent.m0;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import kk.a;
import kk.l;
import kk.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;

    @Deprecated
    private BackOffPolicy backOffPolicy;
    private HttpContent content;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private boolean suppressUserAgentSuffix;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 10;
    private int contentLoggingLimit = 16384;
    private boolean loggingEnabled = true;
    private boolean curlLoggingEnabled = true;
    private int connectTimeout = 20000;
    private int readTimeout = 20000;
    private int writeTimeout = 0;
    private boolean followRedirects = true;
    private boolean useRawRedirectUrls = false;
    private boolean throwExceptionOnExecuteError = true;

    @Deprecated
    private boolean retryOnExecuteIOException = false;
    private Sleeper sleeper = Sleeper.DEFAULT;
    private final t tracer = OpenCensusUtils.getTracer();
    private boolean responseReturnRawInputStream = false;

    static {
        String version = getVersion();
        VERSION = version;
        USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/" + version + " (gzip)";
    }

    HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    private static void addSpanAttribute(l lVar, String str, String str2) {
        if (str2 != null) {
            lVar.g(str, a.a(str2));
        }
    }

    private static String getVersion() {
        String property = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    property = properties.getProperty("google-http-client.version");
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return property;
    }

    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new Callable<HttpResponse>() { // from class: com.google.api.client.http.HttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HttpResponse call() {
                return HttpRequest.this.execute();
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.responseReturnRawInputStream;
    }

    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public boolean getUseRawRedirectUrls() {
        return this.useRawRedirectUrls;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public boolean handleRedirect(int i10, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (!getFollowRedirects() || !HttpStatusCodes.isRedirect(i10) || location == null) {
            return false;
        }
        setUrl(new GenericUrl(this.url.toURL(location), this.useRawRedirectUrls));
        if (i10 == 303) {
            setRequestMethod(HttpMethods.GET);
            setContent(null);
        }
        this.headers.setAuthorization((String) null);
        this.headers.setIfMatch(null);
        this.headers.setIfNoneMatch(null);
        this.headers.setIfModifiedSince(null);
        this.headers.setIfUnmodifiedSince(null);
        this.headers.setIfRange(null);
        return true;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.connectTimeout = i10;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i10) {
        Preconditions.checkArgument(i10 >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i10;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z10) {
        this.curlLoggingEnabled = z10;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z10) {
        this.followRedirects = z10;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean z10) {
        this.loggingEnabled = z10;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.numRetries = i10;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public HttpRequest setReadTimeout(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.readTimeout = i10;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z10) {
        this.responseReturnRawInputStream = z10;
        return this;
    }

    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z10) {
        this.retryOnExecuteIOException = z10;
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z10) {
        this.suppressUserAgentSuffix = z10;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z10) {
        this.throwExceptionOnExecuteError = z10;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z10) {
        this.useRawRedirectUrls = z10;
        return this;
    }

    public HttpRequest setWriteTimeout(int i10) {
        Preconditions.checkArgument(i10 >= 0);
        this.writeTimeout = i10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02c3 A[Catch: all -> 0x02cc, TryCatch #4 {all -> 0x02cc, blocks: (B:116:0x02bd, B:118:0x02c3, B:120:0x02c7, B:125:0x02d1, B:129:0x02e3, B:131:0x02e7, B:133:0x02f1, B:136:0x02fb, B:140:0x0304), top: B:181:0x02bd }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02c7 A[Catch: all -> 0x02cc, TryCatch #4 {all -> 0x02cc, blocks: (B:116:0x02bd, B:118:0x02c3, B:120:0x02c7, B:125:0x02d1, B:129:0x02e3, B:131:0x02e7, B:133:0x02f1, B:136:0x02fb, B:140:0x0304), top: B:181:0x02bd }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d1 A[Catch: all -> 0x02cc, TryCatch #4 {all -> 0x02cc, blocks: (B:116:0x02bd, B:118:0x02c3, B:120:0x02c7, B:125:0x02d1, B:129:0x02e3, B:131:0x02e7, B:133:0x02f1, B:136:0x02fb, B:140:0x0304), top: B:181:0x02bd }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02df  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x0304 A[Catch: all -> 0x02cc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x02cc, blocks: (B:116:0x02bd, B:118:0x02c3, B:120:0x02c7, B:125:0x02d1, B:129:0x02e3, B:131:0x02e7, B:133:0x02f1, B:136:0x02fb, B:140:0x0304), top: B:181:0x02bd }] */
    /* JADX WARN: Code duplicated, block: B:144:0x030c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x030e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0310  */
    /* JADX WARN: Code duplicated, block: B:151:0x0318  */
    /* JADX WARN: Code duplicated, block: B:152:0x031b  */
    /* JADX WARN: Code duplicated, block: B:155:0x032c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0330  */
    /* JADX WARN: Code duplicated, block: B:169:0x034a  */
    /* JADX WARN: Code duplicated, block: B:170:0x034b A[LOOP:0: B:10:0x0035->B:170:0x034b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0200  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x0224  */
    /* JADX WARN: Code duplicated, block: B:79:0x022d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0240  */
    /* JADX WARN: Code duplicated, block: B:86:0x0252  */
    /* JADX WARN: Code duplicated, block: B:90:0x0272 A[Catch: all -> 0x027a, IOException -> 0x027d, TRY_LEAVE, TryCatch #5 {IOException -> 0x027d, blocks: (B:88:0x026c, B:90:0x0272, B:99:0x028c, B:101:0x0292, B:102:0x0295), top: B:178:0x026c, outer: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0196, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01b0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x01cb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01e6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.api.client.http.HttpResponseInterceptor] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.api.client.http.HttpResponse] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.api.client.http.HttpUnsuccessfulResponseHandler] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public HttpResponse execute() throws IOException {
        StringBuilder sb2;
        StringBuilder sb3;
        String userAgent;
        HttpContent httpContent;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        long j10;
        StreamingContent streamingContent;
        boolean z13;
        hk.a aVarD;
        ?? r10;
        HttpIOExceptionHandler httpIOExceptionHandler;
        ?? r11;
        ?? r12;
        boolean zHandleResponse;
        boolean z14;
        BackOffPolicy backOffPolicy;
        long nextBackOffMillis;
        Integer numValueOf;
        ?? r13;
        boolean z15;
        LowLevelHttpResponse lowLevelHttpResponseExecute;
        String type;
        StreamingContent loggingStreamingContent;
        HttpEncoding httpEncoding;
        String name;
        StreamingContent httpEncodingStreamingContent;
        long length;
        String str;
        String str2;
        String string;
        Preconditions.checkArgument(this.numRetries >= 0);
        int i10 = this.numRetries;
        BackOffPolicy backOffPolicy2 = this.backOffPolicy;
        if (backOffPolicy2 != null) {
            backOffPolicy2.reset();
        }
        Preconditions.checkNotNull(this.requestMethod);
        Preconditions.checkNotNull(this.url);
        l lVarB = this.tracer.b(OpenCensusUtils.SPAN_NAME_HTTP_REQUEST_EXECUTE).a(OpenCensusUtils.isRecordEvent()).b();
        int i11 = i10;
        ?? r14 = 0;
        while (true) {
            lVarB.a("retry #" + (this.numRetries - i11));
            if (r14 != 0) {
                r14.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = this.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(this);
            }
            String strBuild = this.url.build();
            addSpanAttribute(lVarB, "http.method", this.requestMethod);
            addSpanAttribute(lVarB, "http.host", this.url.getHost());
            addSpanAttribute(lVarB, "http.path", this.url.getRawPath());
            addSpanAttribute(lVarB, "http.url", strBuild);
            LowLevelHttpRequest lowLevelHttpRequestBuildRequest = this.transport.buildRequest(this.requestMethod, strBuild);
            Logger logger = HttpTransport.LOGGER;
            boolean z16 = this.loggingEnabled && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    try {
                        if (z16) {
                            sb2 = new StringBuilder();
                            sb2.append("-------------- REQUEST  --------------");
                            String str3 = StringUtils.LINE_SEPARATOR;
                            sb2.append(str3);
                            sb2.append(this.requestMethod);
                            sb2.append(' ');
                            sb2.append(strBuild);
                            sb2.append(str3);
                            if (this.curlLoggingEnabled) {
                                sb3 = new StringBuilder("curl -v --compressed");
                                if (!this.requestMethod.equals(HttpMethods.GET)) {
                                    sb3.append(" -X ");
                                    sb3.append(this.requestMethod);
                                }
                            }
                            userAgent = this.headers.getUserAgent();
                            if (!this.suppressUserAgentSuffix) {
                                if (userAgent == null) {
                                    HttpHeaders httpHeaders = this.headers;
                                    String str4 = USER_AGENT_SUFFIX;
                                    httpHeaders.setUserAgent(str4);
                                    addSpanAttribute(lVarB, "http.user_agent", str4);
                                } else {
                                    String str5 = userAgent + " " + USER_AGENT_SUFFIX;
                                    this.headers.setUserAgent(str5);
                                    addSpanAttribute(lVarB, "http.user_agent", str5);
                                }
                            }
                            OpenCensusUtils.propagateTracingContext(lVarB, this.headers);
                            HttpHeaders.serializeHeaders(this.headers, sb2, sb3, logger, lowLevelHttpRequestBuildRequest);
                            if (!this.suppressUserAgentSuffix) {
                                this.headers.setUserAgent(userAgent);
                            }
                            httpContent = this.content;
                            if (httpContent != null || httpContent.retrySupported()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (httpContent != null) {
                                type = this.content.getType();
                                num = null;
                                if (z16) {
                                    j10 = -1;
                                    loggingStreamingContent = new LoggingStreamingContent(httpContent, logger, Level.CONFIG, this.contentLoggingLimit);
                                } else {
                                    j10 = -1;
                                    loggingStreamingContent = httpContent;
                                }
                                httpEncoding = this.encoding;
                                if (httpEncoding == null) {
                                    length = this.content.getLength();
                                    name = null;
                                    httpEncodingStreamingContent = loggingStreamingContent;
                                } else {
                                    name = httpEncoding.getName();
                                    httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                                    length = j10;
                                }
                                if (z16) {
                                    str = QGbBllacZSmHKn.MDqqWeig;
                                    z11 = z16;
                                    if (type != null) {
                                        StringBuilder sb4 = new StringBuilder();
                                        z12 = z10;
                                        sb4.append("Content-Type: ");
                                        sb4.append(type);
                                        string = sb4.toString();
                                        sb2.append(string);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                        if (sb3 != null) {
                                            sb3.append(str + string + "'");
                                        }
                                    } else {
                                        z12 = z10;
                                    }
                                    if (name != null) {
                                        str2 = "Content-Encoding: " + name;
                                        sb2.append(str2);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                        if (sb3 != null) {
                                            sb3.append(str + str2 + "'");
                                        }
                                    }
                                    if (length >= 0) {
                                        sb2.append("Content-Length: " + length);
                                        sb2.append(StringUtils.LINE_SEPARATOR);
                                    }
                                } else {
                                    z11 = z16;
                                    z12 = z10;
                                }
                                if (sb3 != null) {
                                    sb3.append(" -d '@-'");
                                }
                                lowLevelHttpRequestBuildRequest.setContentType(type);
                                lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                                lowLevelHttpRequestBuildRequest.setContentLength(length);
                                lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                                streamingContent = httpEncodingStreamingContent;
                            } else {
                                z11 = z16;
                                z12 = z10;
                                num = null;
                                j10 = -1;
                            }
                            if (z11) {
                                streamingContent = httpContent;
                                logger.config(sb2.toString());
                                if (sb3 != null) {
                                    sb3.append(" -- '");
                                    sb3.append(strBuild.replaceAll("'", "'\"'\"'"));
                                    sb3.append("'");
                                    if (streamingContent != null) {
                                        sb3.append(" << $$$");
                                    }
                                    logger.config(sb3.toString());
                                }
                            }
                            if (z12 || i11 <= 0) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
                            lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
                            aVarD = this.tracer.d(lVarB);
                            OpenCensusUtils.recordSentMessageEvent(lVarB, lowLevelHttpRequestBuildRequest.getContentLength());
                            lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                            if (lowLevelHttpResponseExecute != null) {
                                OpenCensusUtils.recordReceivedMessageEvent(lVarB, lowLevelHttpResponseExecute.getContentLength());
                            }
                            HttpResponse httpResponse = new HttpResponse(this, lowLevelHttpResponseExecute);
                            aVarD.close();
                            r10 = httpResponse;
                            r11 = num;
                            if (r10 == 0) {
                                try {
                                    if (r10.isSuccessStatusCode()) {
                                        if (r10 == 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        z14 = z13 & z15;
                                    } else {
                                        r12 = this.unsuccessfulResponseHandler;
                                        if (r12 != 0) {
                                            zHandleResponse = r12.handleResponse(this, r10, z13);
                                        } else {
                                            zHandleResponse = false;
                                        }
                                        if (!zHandleResponse) {
                                            if (!handleRedirect(r10.getStatusCode(), r10.getHeaders())) {
                                                zHandleResponse = true;
                                            } else if (z13 && (backOffPolicy = this.backOffPolicy) != null && backOffPolicy.isBackOffRequired(r10.getStatusCode())) {
                                                nextBackOffMillis = this.backOffPolicy.getNextBackOffMillis();
                                                if (nextBackOffMillis != j10) {
                                                    try {
                                                        this.sleeper.sleep(nextBackOffMillis);
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    zHandleResponse = true;
                                                }
                                            }
                                        }
                                        z14 = z13 & zHandleResponse;
                                        if (z14) {
                                            r10.ignore();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    r10.disconnect();
                                    throw th2;
                                }
                            } else {
                                if (r10 == 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z14 = z13 & z15;
                            }
                            i11--;
                            if (!z14) {
                                if (r10 == 0) {
                                    numValueOf = num;
                                } else {
                                    numValueOf = Integer.valueOf(r10.getStatusCode());
                                }
                                lVarB.e(OpenCensusUtils.getEndSpanOptions(numValueOf));
                                if (r10 != 0) {
                                    throw r11;
                                }
                                r13 = this.responseInterceptor;
                                if (r13 != 0) {
                                    r13.interceptResponse(r10);
                                }
                                if (this.throwExceptionOnExecuteError || r10.isSuccessStatusCode()) {
                                    return r10;
                                }
                                try {
                                    throw new HttpResponseException((HttpResponse) r10);
                                } catch (Throwable th3) {
                                    r10.disconnect();
                                    throw th3;
                                }
                            }
                            r14 = r10;
                        } else {
                            sb2 = null;
                        }
                        HttpResponse httpResponse2 = new HttpResponse(this, lowLevelHttpResponseExecute);
                        aVarD.close();
                        r10 = httpResponse2;
                        r11 = num;
                    } catch (Throwable th4) {
                        InputStream content = lowLevelHttpResponseExecute.getContent();
                        if (content != null) {
                            content.close();
                        }
                        throw th4;
                    }
                    lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                    if (lowLevelHttpResponseExecute != null) {
                        OpenCensusUtils.recordReceivedMessageEvent(lVarB, lowLevelHttpResponseExecute.getContentLength());
                    }
                } catch (Throwable th5) {
                    aVarD.close();
                    throw th5;
                }
            } catch (IOException e10) {
                if (!this.retryOnExecuteIOException && ((httpIOExceptionHandler = this.ioExceptionHandler) == null || !httpIOExceptionHandler.handleIOException(this, z13))) {
                    lVarB.e(OpenCensusUtils.getEndSpanOptions(num));
                    throw e10;
                }
                if (z11) {
                    logger.log(Level.WARNING, "exception thrown while executing request", (Throwable) e10);
                }
                aVarD.close();
                r10 = num;
                r11 = e10;
            }
            sb3 = null;
            userAgent = this.headers.getUserAgent();
            if (!this.suppressUserAgentSuffix) {
                if (userAgent == null) {
                    HttpHeaders httpHeaders2 = this.headers;
                    String str6 = USER_AGENT_SUFFIX;
                    httpHeaders2.setUserAgent(str6);
                    addSpanAttribute(lVarB, "http.user_agent", str6);
                } else {
                    String str7 = userAgent + " " + USER_AGENT_SUFFIX;
                    this.headers.setUserAgent(str7);
                    addSpanAttribute(lVarB, "http.user_agent", str7);
                }
            }
            OpenCensusUtils.propagateTracingContext(lVarB, this.headers);
            HttpHeaders.serializeHeaders(this.headers, sb2, sb3, logger, lowLevelHttpRequestBuildRequest);
            if (!this.suppressUserAgentSuffix) {
                this.headers.setUserAgent(userAgent);
            }
            httpContent = this.content;
            if (httpContent != null) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (httpContent != null) {
                type = this.content.getType();
                num = null;
                if (z16) {
                    j10 = -1;
                    loggingStreamingContent = new LoggingStreamingContent(httpContent, logger, Level.CONFIG, this.contentLoggingLimit);
                } else {
                    j10 = -1;
                    loggingStreamingContent = httpContent;
                }
                httpEncoding = this.encoding;
                if (httpEncoding == null) {
                    length = this.content.getLength();
                    name = null;
                    httpEncodingStreamingContent = loggingStreamingContent;
                } else {
                    name = httpEncoding.getName();
                    httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                    length = j10;
                }
                if (z16) {
                    str = QGbBllacZSmHKn.MDqqWeig;
                    z11 = z16;
                    if (type != null) {
                        StringBuilder sb5 = new StringBuilder();
                        z12 = z10;
                        sb5.append("Content-Type: ");
                        sb5.append(type);
                        string = sb5.toString();
                        sb2.append(string);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                        if (sb3 != null) {
                            sb3.append(str + string + "'");
                        }
                    } else {
                        z12 = z10;
                    }
                    if (name != null) {
                        str2 = "Content-Encoding: " + name;
                        sb2.append(str2);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                        if (sb3 != null) {
                            sb3.append(str + str2 + "'");
                        }
                    }
                    if (length >= 0) {
                        sb2.append("Content-Length: " + length);
                        sb2.append(StringUtils.LINE_SEPARATOR);
                    }
                } else {
                    z11 = z16;
                    z12 = z10;
                }
                if (sb3 != null) {
                    sb3.append(" -d '@-'");
                }
                lowLevelHttpRequestBuildRequest.setContentType(type);
                lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                lowLevelHttpRequestBuildRequest.setContentLength(length);
                lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                streamingContent = httpEncodingStreamingContent;
            } else {
                z11 = z16;
                z12 = z10;
                num = null;
                j10 = -1;
            }
            if (z11) {
                streamingContent = httpContent;
                logger.config(sb2.toString());
                if (sb3 != null) {
                    sb3.append(" -- '");
                    sb3.append(strBuild.replaceAll("'", "'\"'\"'"));
                    sb3.append("'");
                    if (streamingContent != null) {
                        sb3.append(" << $$$");
                    }
                    logger.config(sb3.toString());
                }
            }
            if (z12) {
                z13 = false;
            } else {
                z13 = false;
            }
            lowLevelHttpRequestBuildRequest.setTimeout(this.connectTimeout, this.readTimeout);
            lowLevelHttpRequestBuildRequest.setWriteTimeout(this.writeTimeout);
            aVarD = this.tracer.d(lVarB);
            OpenCensusUtils.recordSentMessageEvent(lVarB, lowLevelHttpRequestBuildRequest.getContentLength());
            if (r10 == 0) {
                if (r10 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z14 = z13 & z15;
            } else if (r10.isSuccessStatusCode()) {
                r12 = this.unsuccessfulResponseHandler;
                if (r12 != 0) {
                    zHandleResponse = r12.handleResponse(this, r10, z13);
                } else {
                    zHandleResponse = false;
                }
                if (!zHandleResponse) {
                    if (!handleRedirect(r10.getStatusCode(), r10.getHeaders())) {
                        zHandleResponse = true;
                    } else if (z13) {
                        nextBackOffMillis = this.backOffPolicy.getNextBackOffMillis();
                        if (nextBackOffMillis != j10) {
                            this.sleeper.sleep(nextBackOffMillis);
                            zHandleResponse = true;
                        }
                    }
                }
                z14 = z13 & zHandleResponse;
                if (z14) {
                    r10.ignore();
                }
            } else {
                if (r10 == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z14 = z13 & z15;
            }
            i11--;
            if (!z14) {
                if (r10 == 0) {
                    numValueOf = num;
                } else {
                    numValueOf = Integer.valueOf(r10.getStatusCode());
                }
                lVarB.e(OpenCensusUtils.getEndSpanOptions(numValueOf));
                if (r10 != 0) {
                    throw r11;
                }
                r13 = this.responseInterceptor;
                if (r13 != 0) {
                    r13.interceptResponse(r10);
                }
                if (this.throwExceptionOnExecuteError) {
                }
                return r10;
            }
            r14 = r10;
        }
    }

    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new m0().e(true).b()));
    }
}
