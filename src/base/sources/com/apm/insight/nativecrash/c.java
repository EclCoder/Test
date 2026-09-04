package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f10898i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f10899j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f10900k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f10901l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f10902m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f10910h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    public final String a() {
        return this.f10909g;
    }

    public final Map<String, String> b() {
        return this.f10910h;
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f10907e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f10908f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f10909g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final void b(File file) {
        c(j.b(file));
    }

    private void c(File file) {
        if (!file.exists() || file.length() == 0) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i10 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null || i10 >= 64) {
                        break;
                    }
                    if (this.f10903a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f10898i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f10903a = matcher.group(1);
                            this.f10904b = matcher.group(2);
                            this.f10906d = matcher.group(3);
                            this.f10905c = matcher.group(4);
                        }
                    } else if (this.f10907e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f10899j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(" ", "");
                            String strReplace2 = matcher2.group(2).replace(" ", "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f10907e = "Signal " + strReplace + ", Code " + strReplace2 + "\n";
                        }
                    } else if (this.f10908f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f10900k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f10908f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f10908f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f10901l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f10908f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.f10909g == null && line.startsWith("backtrace:")) {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line2 = bufferedReader2.readLine();
                            if (line2 == null || !line2.startsWith("    #")) {
                                break;
                            }
                            sb2.append(line2.substring(4));
                            sb2.append('\n');
                        }
                        i10++;
                        this.f10909g = sb2.toString();
                    } else if (this.f10910h.isEmpty() && line.startsWith("build id:")) {
                        while (true) {
                            String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.contains("BuildId:")) {
                                break;
                            }
                            Matcher matcher5 = f10902m.matcher(line3);
                            if (matcher5.find()) {
                                String strGroup = matcher5.group(1);
                                String strGroup2 = matcher5.group(2);
                                String strGroup3 = matcher5.group(3);
                                if (strGroup.equals(DataSchemeDataSource.SCHEME_DATA)) {
                                    this.f10910h.put(strGroup2, strGroup3);
                                }
                            }
                        }
                    }
                    i10++;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return;
                    } finally {
                        com.apm.insight.a.a((Closeable) bufferedReader);
                    }
                }
            }
            com.apm.insight.a.a((Closeable) bufferedReader2);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
