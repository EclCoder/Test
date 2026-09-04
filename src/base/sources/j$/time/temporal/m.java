package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends n {
    m c(long j10, r rVar);

    m d(long j10, t tVar);

    /* JADX INFO: renamed from: k */
    m m(j$.time.i iVar);

    default m a(long j10, t tVar) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j10, tVar);
    }
}
