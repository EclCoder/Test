package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f16585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16590f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f16591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f16592b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f16593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f16594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f16595e;

        public a(AudioTrack audioTrack) {
            this.f16591a = audioTrack;
        }

        public long a() {
            return this.f16595e;
        }

        public long b() {
            return this.f16592b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f16591a.getTimestamp(this.f16592b);
            if (timestamp) {
                long j10 = this.f16592b.framePosition;
                if (this.f16594d > j10) {
                    this.f16593c++;
                }
                this.f16594d = j10;
                this.f16595e = j10 + (this.f16593c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack) {
        if (r0.f48425a >= 19) {
            this.f16585a = new a(audioTrack);
            g();
        } else {
            this.f16585a = null;
            h(3);
        }
    }

    private void h(int i10) {
        this.f16586b = i10;
        if (i10 == 0) {
            this.f16589e = 0L;
            this.f16590f = -1L;
            this.f16587c = System.nanoTime() / 1000;
            this.f16588d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f16588d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f16588d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f16588d = 500000L;
        }
    }

    public void a() {
        if (this.f16586b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f16585a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f16585a;
        return aVar != null ? aVar.b() : C.TIME_UNSET;
    }

    public boolean d() {
        return this.f16586b == 2;
    }

    public boolean e(long j10) {
        a aVar = this.f16585a;
        if (aVar == null || j10 - this.f16589e < this.f16588d) {
            return false;
        }
        this.f16589e = j10;
        boolean zC = aVar.c();
        int i10 = this.f16586b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        g();
                        return zC;
                    }
                } else if (!zC) {
                    g();
                    return zC;
                }
            } else {
                if (!zC) {
                    g();
                    return zC;
                }
                if (this.f16585a.a() > this.f16590f) {
                    h(2);
                    return zC;
                }
            }
        } else {
            if (zC) {
                if (this.f16585a.b() < this.f16587c) {
                    return false;
                }
                this.f16590f = this.f16585a.a();
                h(1);
                return zC;
            }
            if (j10 - this.f16587c > 500000) {
                h(3);
            }
        }
        return zC;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f16585a != null) {
            h(0);
        }
    }
}
