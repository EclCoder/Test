package zo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements uo.l, uo.a, Cloneable, Serializable {
    private static final long serialVersionUID = -3869795591041535538L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f59031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f59033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f59034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Date f59035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f59037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f59038i;

    public d(String str, String str2) {
        ip.a.h(str, "Name");
        this.f59030a = str;
        this.f59031b = new HashMap();
        this.f59032c = str2;
    }

    @Override // uo.l
    public void b(boolean z10) {
        this.f59037h = z10;
    }

    @Override // uo.a
    public boolean c(String str) {
        return this.f59031b.containsKey(str);
    }

    public Object clone() {
        d dVar = (d) super.clone();
        dVar.f59031b = new HashMap(this.f59031b);
        return dVar;
    }

    @Override // uo.l
    public void d(Date date) {
        this.f59035f = date;
    }

    @Override // uo.l
    public void e(String str) {
        if (str != null) {
            this.f59034e = str.toLowerCase(Locale.ROOT);
        } else {
            this.f59034e = null;
        }
    }

    @Override // uo.c
    public String g() {
        return this.f59034e;
    }

    @Override // uo.c
    public String getName() {
        return this.f59030a;
    }

    @Override // uo.c
    public int[] getPorts() {
        return null;
    }

    @Override // uo.c
    public int getVersion() {
        return this.f59038i;
    }

    @Override // uo.l
    public void h(String str) {
        this.f59036g = str;
    }

    @Override // uo.l
    public void j(String str) {
        this.f59033d = str;
    }

    @Override // uo.c
    public boolean l(Date date) {
        ip.a.h(date, "Date");
        Date date2 = this.f59035f;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    public void n(String str, String str2) {
        this.f59031b.put(str, str2);
    }

    @Override // uo.l
    public void setVersion(int i10) {
        this.f59038i = i10;
    }

    public String toString() {
        return "[version: " + Integer.toString(this.f59038i) + "][name: " + this.f59030a + "][value: " + this.f59032c + "][domain: " + this.f59034e + "][path: " + this.f59036g + "][expiry: " + this.f59035f + "]";
    }

    @Override // uo.c
    public String w() {
        return this.f59036g;
    }
}
