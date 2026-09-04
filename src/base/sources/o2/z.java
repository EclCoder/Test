package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f48185a;

    public z(q qVar) {
        this.f48185a = qVar;
    }

    @Override // o2.q
    public boolean advancePeekPosition(int i10, boolean z10) {
        return this.f48185a.advancePeekPosition(i10, z10);
    }

    @Override // o2.q
    public int b(byte[] bArr, int i10, int i11) {
        return this.f48185a.b(bArr, i10, i11);
    }

    @Override // o2.q
    public long getLength() {
        return this.f48185a.getLength();
    }

    @Override // o2.q
    public long getPeekPosition() {
        return this.f48185a.getPeekPosition();
    }

    @Override // o2.q
    public long getPosition() {
        return this.f48185a.getPosition();
    }

    @Override // o2.q
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f48185a.peekFully(bArr, i10, i11, z10);
    }

    @Override // o2.q, t1.g
    public int read(byte[] bArr, int i10, int i11) {
        return this.f48185a.read(bArr, i10, i11);
    }

    @Override // o2.q
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f48185a.readFully(bArr, i10, i11, z10);
    }

    @Override // o2.q
    public void resetPeekPosition() {
        this.f48185a.resetPeekPosition();
    }

    @Override // o2.q
    public int skip(int i10) {
        return this.f48185a.skip(i10);
    }

    @Override // o2.q
    public void skipFully(int i10) {
        this.f48185a.skipFully(i10);
    }

    @Override // o2.q
    public void advancePeekPosition(int i10) {
        this.f48185a.advancePeekPosition(i10);
    }

    @Override // o2.q
    public void peekFully(byte[] bArr, int i10, int i11) {
        this.f48185a.peekFully(bArr, i10, i11);
    }

    @Override // o2.q
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f48185a.readFully(bArr, i10, i11);
    }
}
