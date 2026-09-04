package i8;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class d extends e.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f41187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f41188f;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f41189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41191d;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f41187e = property;
        f41188f = new d("  ", property);
    }

    public d(String str, String str2) {
        this.f41190c = str.length();
        this.f41189b = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.f41189b, length);
            length += str.length();
        }
        this.f41191d = str2;
    }

    @Override // i8.e.c, i8.e.b
    public void a(com.fasterxml.jackson.core.c cVar, int i10) {
        cVar.N0(this.f41191d);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.f41190c;
        while (true) {
            char[] cArr = this.f41189b;
            if (length <= cArr.length) {
                cVar.T0(cArr, 0, length);
                return;
            } else {
                cVar.T0(cArr, 0, cArr.length);
                length -= this.f41189b.length;
            }
        }
    }

    @Override // i8.e.c, i8.e.b
    public boolean isInline() {
        return false;
    }
}
