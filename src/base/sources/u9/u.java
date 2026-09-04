package u9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f54324a;

    public u(l lVar) {
        this.f54324a = lVar;
    }

    @Override // u9.l
    public boolean advancePeekPosition(int i10, boolean z10) {
        return this.f54324a.advancePeekPosition(i10, z10);
    }

    @Override // u9.l
    public int b(byte[] bArr, int i10, int i11) {
        return this.f54324a.b(bArr, i10, i11);
    }

    @Override // u9.l
    public long getLength() {
        return this.f54324a.getLength();
    }

    @Override // u9.l
    public long getPeekPosition() {
        return this.f54324a.getPeekPosition();
    }

    @Override // u9.l
    public long getPosition() {
        return this.f54324a.getPosition();
    }

    @Override // u9.l
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f54324a.peekFully(bArr, i10, i11, z10);
    }

    @Override // u9.l, nb.h
    public int read(byte[] bArr, int i10, int i11) {
        return this.f54324a.read(bArr, i10, i11);
    }

    @Override // u9.l
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f54324a.readFully(bArr, i10, i11, z10);
    }

    @Override // u9.l
    public void resetPeekPosition() {
        this.f54324a.resetPeekPosition();
    }

    @Override // u9.l
    public int skip(int i10) {
        return this.f54324a.skip(i10);
    }

    @Override // u9.l
    public void skipFully(int i10) {
        this.f54324a.skipFully(i10);
    }

    @Override // u9.l
    public void advancePeekPosition(int i10) {
        this.f54324a.advancePeekPosition(i10);
    }

    @Override // u9.l
    public void peekFully(byte[] bArr, int i10, int i11) {
        this.f54324a.peekFully(bArr, i10, i11);
    }

    @Override // u9.l
    public void readFully(byte[] bArr, int i10, int i11) {
        this.f54324a.readFully(bArr, i10, i11);
    }
}
