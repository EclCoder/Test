package sn;

import android.util.Log;
import bm.r;
import gl.l0;
import gn.b0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f52445a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f52446b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f52447c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = b0.class.getPackage();
        String name = r10 != null ? r10.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(b0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(on.e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(kn.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f52447c = l0.t(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f52446b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f52448a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f52447c.get(str);
        return str2 == null ? r.e1(str, 23) : str2;
    }

    public final void a(String loggerName, int i10, String message, Throwable th2) {
        int iMin;
        s.h(loggerName, "loggerName");
        s.h(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iE0 = r.e0(str, '\n', i11, false, 4, null);
                if (iE0 == -1) {
                    iE0 = length;
                }
                while (true) {
                    iMin = Math.min(iE0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    s.g(strSubstring, "substring(...)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iE0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        try {
            for (Map.Entry entry : f52447c.entrySet()) {
                c((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        } catch (UnsatisfiedLinkError e11) {
            System.err.println("Possibly running android unit test without robolectric");
            e11.printStackTrace();
        }
    }
}
