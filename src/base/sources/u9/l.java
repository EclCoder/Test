package u9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface l extends nb.h {
    void advancePeekPosition(int i10);

    boolean advancePeekPosition(int i10, boolean z10);

    int b(byte[] bArr, int i10, int i11);

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11);

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10);

    @Override // nb.h
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10);

    void resetPeekPosition();

    int skip(int i10);

    void skipFully(int i10);
}
