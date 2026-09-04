package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5029f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f5030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f5031b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5036g;

        public a(AudioTrack audioTrack) {
            this.f5030a = audioTrack;
        }

        public void a() {
            this.f5035f = true;
        }

        public long b() {
            return this.f5034e;
        }

        public long c() {
            return this.f5031b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f5030a.getTimestamp(this.f5031b);
            if (timestamp) {
                long j10 = this.f5031b.framePosition;
                long j11 = this.f5033d;
                if (j11 > j10) {
                    if (this.f5035f) {
                        this.f5036g += j11;
                        this.f5035f = false;
                    } else {
                        this.f5032c++;
                    }
                }
                this.f5033d = j10;
                this.f5034e = j10 + this.f5036g + (this.f5032c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack) {
        this.f5024a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f5025b = i10;
        if (i10 == 0) {
            this.f5028e = 0L;
            this.f5029f = -1L;
            this.f5026c = System.nanoTime() / 1000;
            this.f5027d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f5027d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f5027d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f5027d = 500000L;
        }
    }

    public void a() {
        if (this.f5025b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f5024a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f5024a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f5024a;
        return aVar != null ? aVar.c() : C.TIME_UNSET;
    }

    public boolean e() {
        return this.f5025b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f5024a;
        if (aVar == null || j10 - this.f5028e < this.f5027d) {
            return false;
        }
        this.f5028e = j10;
        boolean zD = aVar.d();
        int i10 = this.f5025b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        h();
                        return zD;
                    }
                } else if (!zD) {
                    h();
                    return zD;
                }
            } else {
                if (!zD) {
                    h();
                    return zD;
                }
                if (this.f5024a.b() > this.f5029f) {
                    i(2);
                    return zD;
                }
            }
        } else {
            if (zD) {
                if (this.f5024a.c() < this.f5026c) {
                    return false;
                }
                this.f5029f = this.f5024a.b();
                i(1);
                return zD;
            }
            if (j10 - this.f5026c > 500000) {
                i(3);
            }
        }
        return zD;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f5024a != null) {
            i(0);
        }
    }
}
