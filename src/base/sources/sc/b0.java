package sc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {
    private static final b0 SYSTEM_TICKER = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends b0 {
        a() {
        }

        @Override // sc.b0
        public long read() {
            return System.nanoTime();
        }
    }

    protected b0() {
    }

    public static b0 systemTicker() {
        return SYSTEM_TICKER;
    }

    public abstract long read();
}
