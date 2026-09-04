package i8;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f41204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f41205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f41206c;

    public h() {
        this(':', ',', ',');
    }

    public static h d() {
        return new h();
    }

    public char g() {
        return this.f41206c;
    }

    public char h() {
        return this.f41205b;
    }

    public char i() {
        return this.f41204a;
    }

    public h(char c10, char c11, char c12) {
        this.f41204a = c10;
        this.f41205b = c11;
        this.f41206c = c12;
    }
}
