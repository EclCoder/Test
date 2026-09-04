package cf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f9974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9975b;

    b(int[] iArr, int i10) {
        this.f9974a = iArr;
        this.f9975b = i10;
    }

    public int d() {
        return this.f9975b;
    }

    public int e(c cVar) {
        char c10;
        int iF = cVar.f();
        if (iF <= 9) {
            c10 = 0;
        } else {
            c10 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.f9974a[c10];
    }
}
