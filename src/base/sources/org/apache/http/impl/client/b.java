package org.apache.http.impl.client;

import org.apache.http.HttpException;
import org.apache.http.client.ClientProtocolException;
import zo.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends h {
    private fo.d backoffManager;
    private oo.b connManager;
    private fo.e connectionBackoffStrategy;
    private fo.f cookieStore;
    private fo.g credsProvider;
    private ep.d defaultParams;
    private oo.e keepAliveStrategy;
    private final zn.a log;
    private gp.b mutableProcessor;
    private gp.k protocolProcessor;
    private fo.c proxyAuthStrategy;
    private fo.k redirectStrategy;
    private gp.j requestExec;
    private fo.i retryHandler;
    private co.a reuseStrategy;
    private qo.d routePlanner;
    private eo.e supportedAuthSchemes;
    private uo.j supportedCookieSpecs;
    private fo.c targetAuthStrategy;
    private fo.n userTokenHandler;

    protected b(oo.b bVar, ep.d dVar) {
        zn.h.k(getClass());
        this.defaultParams = dVar;
        this.connManager = bVar;
    }

    private synchronized gp.h d() {
        try {
            if (this.protocolProcessor == null) {
                gp.b httpProcessor = getHttpProcessor();
                int iP = httpProcessor.p();
                co.p[] pVarArr = new co.p[iP];
                for (int i10 = 0; i10 < iP; i10++) {
                    pVarArr[i10] = httpProcessor.o(i10);
                }
                int iR = httpProcessor.r();
                co.s[] sVarArr = new co.s[iR];
                for (int i11 = 0; i11 < iR; i11++) {
                    sVarArr[i11] = httpProcessor.q(i11);
                }
                this.protocolProcessor = new gp.k(pVarArr, sVarArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.protocolProcessor;
    }

    public synchronized void addRequestInterceptor(co.p pVar) {
        getHttpProcessor().d(pVar);
        this.protocolProcessor = null;
    }

    public synchronized void addResponseInterceptor(co.s sVar) {
        getHttpProcessor().f(sVar);
        this.protocolProcessor = null;
    }

    public synchronized void clearRequestInterceptors() {
        getHttpProcessor().l();
        this.protocolProcessor = null;
    }

    public synchronized void clearResponseInterceptors() {
        getHttpProcessor().m();
        this.protocolProcessor = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getConnectionManager().shutdown();
    }

    protected eo.e createAuthSchemeRegistry() {
        eo.e eVar = new eo.e();
        eVar.c("Basic", new wo.c());
        eVar.c("Digest", new wo.d());
        eVar.c("NTLM", new wo.g());
        eVar.c("Negotiate", new wo.i());
        eVar.c("Kerberos", new wo.f());
        return eVar;
    }

    protected oo.b createClientConnectionManager() {
        ro.i iVarA = xo.q.a();
        String str = (String) getParams().getParameter("http.connection-manager.factory-class-name");
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (str != null) {
            try {
                android.support.v4.media.session.b.a((contextClassLoader != null ? Class.forName(str, true, contextClassLoader) : Class.forName(str)).newInstance());
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e10) {
                throw new IllegalAccessError(e10.getMessage());
            } catch (InstantiationException e11) {
                throw new InstantiationError(e11.getMessage());
            }
        }
        return new xo.a(iVarA);
    }

    @Deprecated
    protected fo.l createClientRequestDirector(gp.j jVar, oo.b bVar, co.a aVar, oo.e eVar, qo.d dVar, gp.h hVar, fo.i iVar, fo.k kVar, fo.b bVar2, fo.b bVar3, fo.n nVar, ep.d dVar2) {
        return new s((zn.a) null, jVar, bVar, aVar, eVar, dVar, hVar, iVar, kVar, bVar2, bVar3, nVar, dVar2);
    }

    protected oo.e createConnectionKeepAliveStrategy() {
        return new l();
    }

    protected co.a createConnectionReuseStrategy() {
        return new vo.c();
    }

    protected uo.j createCookieSpecRegistry() {
        uo.j jVar = new uo.j();
        jVar.c("default", new zo.l());
        jVar.c("best-match", new zo.l());
        jVar.c("compatibility", new zo.n());
        jVar.c("netscape", new zo.x());
        jVar.c("rfc2109", new zo.b0());
        jVar.c("rfc2965", new i0());
        jVar.c("ignoreCookies", new zo.s());
        return jVar;
    }

    protected fo.f createCookieStore() {
        return new e();
    }

    protected fo.g createCredentialsProvider() {
        return new f();
    }

    protected gp.f createHttpContext() {
        gp.a aVar = new gp.a();
        aVar.a("http.scheme-registry", getConnectionManager().b());
        aVar.a("http.authscheme-registry", getAuthSchemes());
        aVar.a("http.cookiespec-registry", getCookieSpecs());
        aVar.a("http.cookie-store", getCookieStore());
        aVar.a("http.auth.credentials-provider", getCredentialsProvider());
        return aVar;
    }

    protected abstract ep.d createHttpParams();

    protected abstract gp.b createHttpProcessor();

    protected fo.i createHttpRequestRetryHandler() {
        return new n();
    }

    protected qo.d createHttpRoutePlanner() {
        return new xo.h(getConnectionManager().b());
    }

    @Deprecated
    protected fo.b createProxyAuthenticationHandler() {
        return new o();
    }

    protected fo.c createProxyAuthenticationStrategy() {
        return new b0();
    }

    @Deprecated
    protected fo.j createRedirectHandler() {
        return new p();
    }

    protected gp.j createRequestExecutor() {
        return new gp.j();
    }

    @Deprecated
    protected fo.b createTargetAuthenticationHandler() {
        return new t();
    }

    protected fo.c createTargetAuthenticationStrategy() {
        return new f0();
    }

    protected fo.n createUserTokenHandler() {
        return new u();
    }

    protected ep.d determineParams(co.o oVar) {
        return new g(null, getParams(), oVar.getParams(), null);
    }

    @Override // org.apache.http.impl.client.h
    protected final io.c doExecute(co.l lVar, co.o oVar, gp.f fVar) throws ClientProtocolException {
        gp.f dVar;
        fo.l lVarCreateClientRequestDirector;
        ip.a.h(oVar, "HTTP request");
        synchronized (this) {
            gp.f fVarCreateHttpContext = createHttpContext();
            dVar = fVar == null ? fVarCreateHttpContext : new gp.d(fVar, fVarCreateHttpContext);
            ep.d dVarDetermineParams = determineParams(oVar);
            dVar.a("http.request-config", jo.a.a(dVarDetermineParams));
            lVarCreateClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), d(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), dVarDetermineParams);
            getRoutePlanner();
            getConnectionBackoffStrategy();
            getBackoffManager();
        }
        try {
            return i.b(lVarCreateClientRequestDirector.execute(lVar, oVar, dVar));
        } catch (HttpException e10) {
            throw new ClientProtocolException(e10);
        }
    }

    public final synchronized eo.e getAuthSchemes() {
        try {
            if (this.supportedAuthSchemes == null) {
                this.supportedAuthSchemes = createAuthSchemeRegistry();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.supportedAuthSchemes;
    }

    public final synchronized fo.d getBackoffManager() {
        return null;
    }

    public final synchronized fo.e getConnectionBackoffStrategy() {
        return null;
    }

    public final synchronized oo.e getConnectionKeepAliveStrategy() {
        try {
            if (this.keepAliveStrategy == null) {
                this.keepAliveStrategy = createConnectionKeepAliveStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.keepAliveStrategy;
    }

    @Override // fo.h
    public final synchronized oo.b getConnectionManager() {
        try {
            if (this.connManager == null) {
                this.connManager = createClientConnectionManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.connManager;
    }

    public final synchronized co.a getConnectionReuseStrategy() {
        try {
            if (this.reuseStrategy == null) {
                this.reuseStrategy = createConnectionReuseStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.reuseStrategy;
    }

    public final synchronized uo.j getCookieSpecs() {
        try {
            if (this.supportedCookieSpecs == null) {
                this.supportedCookieSpecs = createCookieSpecRegistry();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.supportedCookieSpecs;
    }

    public final synchronized fo.f getCookieStore() {
        try {
            if (this.cookieStore == null) {
                this.cookieStore = createCookieStore();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.cookieStore;
    }

    public final synchronized fo.g getCredentialsProvider() {
        try {
            if (this.credsProvider == null) {
                this.credsProvider = createCredentialsProvider();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.credsProvider;
    }

    protected final synchronized gp.b getHttpProcessor() {
        try {
            if (this.mutableProcessor == null) {
                this.mutableProcessor = createHttpProcessor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mutableProcessor;
    }

    public final synchronized fo.i getHttpRequestRetryHandler() {
        try {
            if (this.retryHandler == null) {
                this.retryHandler = createHttpRequestRetryHandler();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.retryHandler;
    }

    @Override // fo.h
    public final synchronized ep.d getParams() {
        try {
            if (this.defaultParams == null) {
                this.defaultParams = createHttpParams();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.defaultParams;
    }

    @Deprecated
    public final synchronized fo.b getProxyAuthenticationHandler() {
        return createProxyAuthenticationHandler();
    }

    public final synchronized fo.c getProxyAuthenticationStrategy() {
        try {
            if (this.proxyAuthStrategy == null) {
                this.proxyAuthStrategy = createProxyAuthenticationStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.proxyAuthStrategy;
    }

    @Deprecated
    public final synchronized fo.j getRedirectHandler() {
        return createRedirectHandler();
    }

    public final synchronized fo.k getRedirectStrategy() {
        try {
            if (this.redirectStrategy == null) {
                this.redirectStrategy = new q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.redirectStrategy;
    }

    public final synchronized gp.j getRequestExecutor() {
        try {
            if (this.requestExec == null) {
                this.requestExec = createRequestExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.requestExec;
    }

    public synchronized co.p getRequestInterceptor(int i10) {
        return getHttpProcessor().o(i10);
    }

    public synchronized int getRequestInterceptorCount() {
        return getHttpProcessor().p();
    }

    public synchronized co.s getResponseInterceptor(int i10) {
        return getHttpProcessor().q(i10);
    }

    public synchronized int getResponseInterceptorCount() {
        return getHttpProcessor().r();
    }

    public final synchronized qo.d getRoutePlanner() {
        try {
            if (this.routePlanner == null) {
                this.routePlanner = createHttpRoutePlanner();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.routePlanner;
    }

    @Deprecated
    public final synchronized fo.b getTargetAuthenticationHandler() {
        return createTargetAuthenticationHandler();
    }

    public final synchronized fo.c getTargetAuthenticationStrategy() {
        try {
            if (this.targetAuthStrategy == null) {
                this.targetAuthStrategy = createTargetAuthenticationStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.targetAuthStrategy;
    }

    public final synchronized fo.n getUserTokenHandler() {
        try {
            if (this.userTokenHandler == null) {
                this.userTokenHandler = createUserTokenHandler();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.userTokenHandler;
    }

    public synchronized void removeRequestInterceptorByClass(Class<? extends co.p> cls) {
        getHttpProcessor().s(cls);
        this.protocolProcessor = null;
    }

    public synchronized void removeResponseInterceptorByClass(Class<? extends co.s> cls) {
        getHttpProcessor().t(cls);
        this.protocolProcessor = null;
    }

    public synchronized void setAuthSchemes(eo.e eVar) {
        this.supportedAuthSchemes = eVar;
    }

    public synchronized void setBackoffManager(fo.d dVar) {
    }

    public synchronized void setConnectionBackoffStrategy(fo.e eVar) {
    }

    public synchronized void setCookieSpecs(uo.j jVar) {
        this.supportedCookieSpecs = jVar;
    }

    public synchronized void setCookieStore(fo.f fVar) {
        this.cookieStore = fVar;
    }

    public synchronized void setCredentialsProvider(fo.g gVar) {
        this.credsProvider = gVar;
    }

    public synchronized void setHttpRequestRetryHandler(fo.i iVar) {
        this.retryHandler = iVar;
    }

    public synchronized void setKeepAliveStrategy(oo.e eVar) {
        this.keepAliveStrategy = eVar;
    }

    public synchronized void setParams(ep.d dVar) {
        this.defaultParams = dVar;
    }

    @Deprecated
    public synchronized void setProxyAuthenticationHandler(fo.b bVar) {
        this.proxyAuthStrategy = new c(bVar);
    }

    public synchronized void setProxyAuthenticationStrategy(fo.c cVar) {
        this.proxyAuthStrategy = cVar;
    }

    @Deprecated
    public synchronized void setRedirectHandler(fo.j jVar) {
        this.redirectStrategy = new r(jVar);
    }

    public synchronized void setRedirectStrategy(fo.k kVar) {
        this.redirectStrategy = kVar;
    }

    public synchronized void setReuseStrategy(co.a aVar) {
        this.reuseStrategy = aVar;
    }

    public synchronized void setRoutePlanner(qo.d dVar) {
        this.routePlanner = dVar;
    }

    @Deprecated
    public synchronized void setTargetAuthenticationHandler(fo.b bVar) {
        this.targetAuthStrategy = new c(bVar);
    }

    public synchronized void setTargetAuthenticationStrategy(fo.c cVar) {
        this.targetAuthStrategy = cVar;
    }

    public synchronized void setUserTokenHandler(fo.n nVar) {
        this.userTokenHandler = nVar;
    }

    protected fo.l createClientRequestDirector(gp.j jVar, oo.b bVar, co.a aVar, oo.e eVar, qo.d dVar, gp.h hVar, fo.i iVar, fo.k kVar, fo.c cVar, fo.c cVar2, fo.n nVar, ep.d dVar2) {
        return new s((zn.a) null, jVar, bVar, aVar, eVar, dVar, hVar, iVar, kVar, cVar, cVar2, nVar, dVar2);
    }

    public synchronized void addRequestInterceptor(co.p pVar, int i10) {
        getHttpProcessor().e(pVar, i10);
        this.protocolProcessor = null;
    }

    public synchronized void addResponseInterceptor(co.s sVar, int i10) {
        getHttpProcessor().g(sVar, i10);
        this.protocolProcessor = null;
    }
}
