package ip;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import ud.qoRq.WwUgngZLNA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41588e;

    protected h(String str, String str2, String str3, String str4, String str5) {
        a.h(str, "Package identifier");
        this.f41584a = str;
        this.f41585b = str2 == null ? "UNAVAILABLE" : str2;
        this.f41586c = str3 == null ? "UNAVAILABLE" : str3;
        this.f41587d = str4 == null ? "UNAVAILABLE" : str4;
        this.f41588e = str5 == null ? "UNAVAILABLE" : str5;
    }

    protected static h a(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        a.h(str, "Package identifier");
        if (map != null) {
            String str5 = (String) map.get("info.module");
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get("info.release");
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get("info.timestamp");
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new h(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }

    public static String c(String str, String str2, Class cls) {
        h hVarD = d(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", str, hVarD != null ? hVarD.b() : "UNAVAILABLE", System.getProperty("java.version"));
    }

    public final String b() {
        return this.f41586c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f41584a.length() + 20 + this.f41585b.length() + this.f41586c.length() + this.f41587d.length() + this.f41588e.length());
        sb2.append("VersionInfo(");
        sb2.append(this.f41584a);
        sb2.append(':');
        sb2.append(this.f41585b);
        if (!"UNAVAILABLE".equals(this.f41586c)) {
            sb2.append(':');
            sb2.append(this.f41586c);
        }
        if (!"UNAVAILABLE".equals(this.f41587d)) {
            sb2.append(':');
            sb2.append(this.f41587d);
        }
        sb2.append(')');
        if (!"UNAVAILABLE".equals(this.f41588e)) {
            sb2.append('@');
            sb2.append(this.f41588e);
        }
        return sb2.toString();
    }

    public static h d(String str, ClassLoader classLoader) {
        Properties properties;
        a.h(str, "Package identifier");
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        try {
            InputStream resourceAsStream = classLoader.getResourceAsStream(str.replace('.', '/') + "/" + WwUgngZLNA.kJMATKlPEYoz);
            if (resourceAsStream != null) {
                try {
                    properties = new Properties();
                    properties.load(resourceAsStream);
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    resourceAsStream.close();
                    throw th2;
                }
            } else {
                properties = null;
            }
        } catch (IOException unused2) {
            properties = null;
        }
        if (properties != null) {
            return a(str, properties, classLoader);
        }
        return null;
    }
}
