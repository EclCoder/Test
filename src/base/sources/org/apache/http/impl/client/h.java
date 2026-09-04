package org.apache.http.impl.client;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import org.apache.http.client.ClientProtocolException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h implements fo.h, Closeable {
    private final zn.a log;

    public h() {
        zn.h.k(getClass());
    }

    private static co.l a(io.q qVar) throws ClientProtocolException {
        URI uri = qVar.getURI();
        if (!uri.isAbsolute()) {
            return null;
        }
        co.l lVarA = lo.d.a(uri);
        if (lVarA != null) {
            return lVarA;
        }
        throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
    }

    protected abstract io.c doExecute(co.l lVar, co.o oVar, gp.f fVar);

    public io.c execute(co.l lVar, co.o oVar, gp.f fVar) {
        return doExecute(lVar, oVar, fVar);
    }

    public io.c execute(io.q qVar, gp.f fVar) {
        ip.a.h(qVar, "HTTP request");
        return doExecute(a(qVar), qVar, fVar);
    }

    @Override // fo.h
    public io.c execute(io.q qVar) {
        return execute(qVar, (gp.f) null);
    }

    public io.c execute(co.l lVar, co.o oVar) {
        return doExecute(lVar, oVar, null);
    }

    public <T> T execute(io.q qVar, fo.m mVar) {
        return (T) execute(qVar, mVar, (gp.f) null);
    }

    public <T> T execute(io.q qVar, fo.m mVar, gp.f fVar) {
        return (T) execute(a(qVar), qVar, mVar, fVar);
    }

    public <T> T execute(co.l lVar, co.o oVar, fo.m mVar) {
        return (T) execute(lVar, oVar, mVar, null);
    }

    public <T> T execute(co.l lVar, co.o oVar, fo.m mVar, gp.f fVar) throws IOException {
        ip.a.h(mVar, "Response handler");
        io.c cVarExecute = execute(lVar, oVar, fVar);
        try {
            try {
                T t10 = (T) mVar.a(cVarExecute);
                ip.e.a(cVarExecute.getEntity());
                cVarExecute.close();
                return t10;
            } catch (ClientProtocolException e10) {
                try {
                    ip.e.a(cVarExecute.getEntity());
                    throw e10;
                } catch (Exception unused) {
                    throw null;
                }
            }
        } catch (Throwable th2) {
            cVarExecute.close();
            throw th2;
        }
    }
}
