package te;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f53317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f53318d;

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f53317c = (short) i10;
        this.f53318d = (short) i11;
    }

    @Override // te.g
    public void c(ue.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f53318d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.d(31, 5);
                short s11 = this.f53318d;
                if (s11 > 62) {
                    aVar.d(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.d(Math.min((int) s11, 31), 5);
                } else {
                    aVar.d(s11 - 31, 5);
                }
            }
            aVar.d(bArr[this.f53317c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f53317c);
        sb2.append("::");
        sb2.append((this.f53317c + this.f53318d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
