package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.common.collect.c0;
import ik.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import kk.h;
import kk.j;
import kk.k;
import kk.l;
import kk.p;
import kk.t;
import kk.v;
import mk.a;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OpenCensusUtils {
    static volatile a propagationTextFormat;
    static volatile a.c propagationTextFormatSetter;
    private static final Logger logger = Logger.getLogger(OpenCensusUtils.class.getName());
    public static final String SPAN_NAME_HTTP_REQUEST_EXECUTE = "Sent." + HttpRequest.class.getName() + ".execute";
    private static final t tracer = v.b();
    private static final AtomicLong idGenerator = new AtomicLong();
    private static volatile boolean isRecordEvent = true;

    static {
        propagationTextFormat = null;
        propagationTextFormatSetter = null;
        try {
            propagationTextFormat = b.a();
            propagationTextFormatSetter = new a.c() { // from class: com.google.api.client.http.OpenCensusUtils.1
                @Override // mk.a.c
                public void put(HttpHeaders httpHeaders, String str, String str2) {
                    httpHeaders.set(str, (Object) str2);
                }
            };
        } catch (Exception e10) {
            logger.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e10);
        }
        try {
            v.a().a().b(c0.D(SPAN_NAME_HTTP_REQUEST_EXECUTE));
        } catch (Exception e11) {
            logger.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e11);
        }
    }

    private OpenCensusUtils() {
    }

    public static j getEndSpanOptions(Integer num) {
        j.a aVarA = j.a();
        if (num == null) {
            aVarA.b(p.f43472f);
        } else if (HttpStatusCodes.isSuccess(num.intValue())) {
            aVarA.b(p.f43470d);
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 400) {
                aVarA.b(p.f43473g);
            } else if (iIntValue == 401) {
                aVarA.b(p.f43478l);
            } else if (iIntValue == 403) {
                aVarA.b(p.f43477k);
            } else if (iIntValue == 404) {
                aVarA.b(p.f43475i);
            } else if (iIntValue == 412) {
                aVarA.b(p.f43480n);
            } else if (iIntValue != 500) {
                aVarA.b(p.f43472f);
            } else {
                aVarA.b(p.f43485s);
            }
        }
        return aVarA.a();
    }

    public static t getTracer() {
        return tracer;
    }

    public static boolean isRecordEvent() {
        return isRecordEvent;
    }

    public static void propagateTracingContext(l lVar, HttpHeaders httpHeaders) {
        Preconditions.checkArgument(lVar != null, "span should not be null.");
        Preconditions.checkArgument(httpHeaders != null, "headers should not be null.");
        if (propagationTextFormat == null || propagationTextFormatSetter == null || lVar.equals(h.f43447e)) {
            return;
        }
        propagationTextFormat.a(lVar.f(), httpHeaders, propagationTextFormatSetter);
    }

    static void recordMessageEvent(l lVar, long j10, k.b bVar) {
        Preconditions.checkArgument(lVar != null, "span should not be null.");
        if (j10 < 0) {
            j10 = 0;
        }
        lVar.c(k.a(bVar, idGenerator.getAndIncrement()).d(j10).a());
    }

    public static void recordReceivedMessageEvent(l lVar, long j10) {
        recordMessageEvent(lVar, j10, k.b.RECEIVED);
    }

    public static void recordSentMessageEvent(l lVar, long j10) {
        recordMessageEvent(lVar, j10, k.b.SENT);
    }

    public static void setIsRecordEvent(boolean z10) {
        isRecordEvent = z10;
    }

    public static void setPropagationTextFormat(a aVar) {
        propagationTextFormat = aVar;
    }

    public static void setPropagationTextFormatSetter(a.c cVar) {
        propagationTextFormatSetter = cVar;
    }
}
