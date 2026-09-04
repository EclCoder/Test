package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Matrix f35768g = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f35769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f35770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f35771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f35772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f35773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PointF f35774f = new PointF();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35775a;

        static {
            int[] iArr = new int[b.values().length];
            f35775a = iArr;
            try {
                iArr[b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35775a[b.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35775a[b.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35775a[b.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35775a[b.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35775a[b.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35775a[b.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35775a[b.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35775a[b.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    public h(b bVar, g gVar, float f10, float f11) {
        this.f35773e = bVar;
        this.f35769a = gVar.e();
        this.f35770b = gVar.d();
        this.f35771c = gVar.c();
        this.f35772d = gVar.b();
        l(gVar.h(), f10, f11);
    }

    private void a(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z10, boolean z11) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f35774f.y -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.bottom;
        if (f10 > f14) {
            this.f35774f.y -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.top;
        float f16 = f10 - f15;
        float f17 = this.f35770b;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f35772d;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) * f12;
            float f21 = this.f35769a;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            float f22 = this.f35771c;
            if (f20 > f22) {
                f10 = Math.min(rectF2.bottom, rectF.top + (f22 / f12));
                f20 = (f10 - rectF.top) * f12;
            }
            if (z10 && z11) {
                f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f12)));
            } else {
                if (z10) {
                    float f23 = rectF.right;
                    float f24 = f23 - f20;
                    float f25 = rectF2.left;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.bottom, rectF.top + ((f23 - f25) / f12));
                        f20 = (f10 - rectF.top) * f12;
                    }
                }
                if (z11) {
                    float f26 = rectF.left;
                    float f27 = f20 + f26;
                    float f28 = rectF2.right;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.bottom, rectF.top + ((f28 - f26) / f12)));
                    }
                }
            }
        }
        rectF.bottom = f10;
    }

    private void b(RectF rectF, float f10) {
        rectF.bottom = rectF.top + (rectF.width() / f10);
    }

    private void c(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f35774f.x -= f10 / 1.1f;
        }
        float f13 = rectF2.left;
        if (f10 < f13) {
            this.f35774f.x -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.right;
        float f15 = f14 - f10;
        float f16 = this.f35769a;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f35771c;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) / f12;
            float f20 = this.f35770b;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            float f21 = this.f35772d;
            if (f19 > f21) {
                f10 = Math.max(rectF2.left, rectF.right - (f21 * f12));
                f19 = (rectF.right - f10) / f12;
            }
            if (z10 && z11) {
                f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - (rectF2.height() * f12)));
            } else {
                if (z10) {
                    float f22 = rectF.bottom;
                    float f23 = f22 - f19;
                    float f24 = rectF2.top;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.left, rectF.right - ((f22 - f24) * f12));
                        f19 = (rectF.right - f10) / f12;
                    }
                }
                if (z11) {
                    float f25 = rectF.top;
                    float f26 = f19 + f25;
                    float f27 = rectF2.bottom;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.left, rectF.right - ((f27 - f25) * f12)));
                    }
                }
            }
        }
        rectF.left = f10;
    }

    private void d(RectF rectF, float f10) {
        rectF.left = rectF.right - (rectF.height() * f10);
    }

    private void e(RectF rectF, RectF rectF2, float f10) {
        rectF.inset((rectF.width() - (rectF.height() * f10)) / 2.0f, 0.0f);
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.right;
        float f14 = rectF2.right;
        if (f13 > f14) {
            rectF.offset(f14 - f13, 0.0f);
        }
    }

    private void f(RectF rectF, float f10, RectF rectF2, int i10, float f11, float f12, boolean z10, boolean z11) {
        float f13 = i10;
        if (f10 > f13) {
            f10 = ((f10 - f13) / 1.05f) + f13;
            this.f35774f.x -= (f10 - f13) / 1.1f;
        }
        float f14 = rectF2.right;
        if (f10 > f14) {
            this.f35774f.x -= (f10 - f14) / 2.0f;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        float f15 = rectF.left;
        float f16 = f10 - f15;
        float f17 = this.f35769a;
        if (f16 < f17) {
            f10 = f15 + f17;
        }
        float f18 = f10 - f15;
        float f19 = this.f35771c;
        if (f18 > f19) {
            f10 = f15 + f19;
        }
        if (f14 - f10 < f11) {
            f10 = f14;
        }
        if (f12 > 0.0f) {
            float f20 = (f10 - f15) / f12;
            float f21 = this.f35770b;
            if (f20 < f21) {
                f10 = Math.min(f14, f15 + (f21 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            float f22 = this.f35772d;
            if (f20 > f22) {
                f10 = Math.min(rectF2.right, rectF.left + (f22 * f12));
                f20 = (f10 - rectF.left) / f12;
            }
            if (z10 && z11) {
                f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + (rectF2.height() * f12)));
            } else {
                if (z10) {
                    float f23 = rectF.bottom;
                    float f24 = f23 - f20;
                    float f25 = rectF2.top;
                    if (f24 < f25) {
                        f10 = Math.min(rectF2.right, rectF.left + ((f23 - f25) * f12));
                        f20 = (f10 - rectF.left) / f12;
                    }
                }
                if (z11) {
                    float f26 = rectF.top;
                    float f27 = f20 + f26;
                    float f28 = rectF2.bottom;
                    if (f27 > f28) {
                        f10 = Math.min(f10, Math.min(rectF2.right, rectF.left + ((f28 - f26) * f12)));
                    }
                }
            }
        }
        rectF.right = f10;
    }

    private void g(RectF rectF, float f10) {
        rectF.right = rectF.left + (rectF.height() * f10);
    }

    private void h(RectF rectF, float f10, RectF rectF2, float f11, float f12, boolean z10, boolean z11) {
        if (f10 < 0.0f) {
            f10 /= 1.05f;
            this.f35774f.y -= f10 / 1.1f;
        }
        float f13 = rectF2.top;
        if (f10 < f13) {
            this.f35774f.y -= (f10 - f13) / 2.0f;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        float f14 = rectF.bottom;
        float f15 = f14 - f10;
        float f16 = this.f35770b;
        if (f15 < f16) {
            f10 = f14 - f16;
        }
        float f17 = f14 - f10;
        float f18 = this.f35772d;
        if (f17 > f18) {
            f10 = f14 - f18;
        }
        if (f10 - f13 < f11) {
            f10 = f13;
        }
        if (f12 > 0.0f) {
            float f19 = (f14 - f10) * f12;
            float f20 = this.f35769a;
            if (f19 < f20) {
                f10 = Math.max(f13, f14 - (f20 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            float f21 = this.f35771c;
            if (f19 > f21) {
                f10 = Math.max(rectF2.top, rectF.bottom - (f21 / f12));
                f19 = (rectF.bottom - f10) * f12;
            }
            if (z10 && z11) {
                f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f12)));
            } else {
                if (z10) {
                    float f22 = rectF.right;
                    float f23 = f22 - f19;
                    float f24 = rectF2.left;
                    if (f23 < f24) {
                        f10 = Math.max(rectF2.top, rectF.bottom - ((f22 - f24) / f12));
                        f19 = (rectF.bottom - f10) * f12;
                    }
                }
                if (z11) {
                    float f25 = rectF.left;
                    float f26 = f19 + f25;
                    float f27 = rectF2.right;
                    if (f26 > f27) {
                        f10 = Math.max(f10, Math.max(rectF2.top, rectF.bottom - ((f27 - f25) / f12)));
                    }
                }
            }
        }
        rectF.top = f10;
    }

    private void i(RectF rectF, RectF rectF2, float f10) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f10)) / 2.0f);
        float f11 = rectF.top;
        float f12 = rectF2.top;
        if (f11 < f12) {
            rectF.offset(0.0f, f12 - f11);
        }
        float f13 = rectF.bottom;
        float f14 = rectF2.bottom;
        if (f13 > f14) {
            rectF.offset(0.0f, f14 - f13);
        }
    }

    private void j(RectF rectF, float f10) {
        rectF.top = rectF.bottom - (rectF.width() / f10);
    }

    private static float k(float f10, float f11, float f12, float f13) {
        return (f12 - f10) / (f13 - f11);
    }

    private void l(RectF rectF, float f10, float f11) {
        float fCenterY;
        float f12;
        float f13;
        float fCenterX = 0.0f;
        switch (a.f35775a[this.f35773e.ordinal()]) {
            case 1:
                fCenterX = rectF.left - f10;
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                break;
            case 2:
                fCenterX = rectF.right - f10;
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                break;
            case 3:
                fCenterX = rectF.left - f10;
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                break;
            case 4:
                fCenterX = rectF.right - f10;
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                break;
            case 5:
                f12 = rectF.left;
                fCenterX = f12 - f10;
                f13 = 0.0f;
                break;
            case 6:
                fCenterY = rectF.top;
                f13 = fCenterY - f11;
                break;
            case 7:
                f12 = rectF.right;
                fCenterX = f12 - f10;
                f13 = 0.0f;
                break;
            case 8:
                fCenterY = rectF.bottom;
                f13 = fCenterY - f11;
                break;
            case 9:
                fCenterX = rectF.centerX() - f10;
                fCenterY = rectF.centerY();
                f13 = fCenterY - f11;
                break;
            default:
                f13 = 0.0f;
                break;
        }
        PointF pointF = this.f35774f;
        pointF.x = fCenterX;
        pointF.y = f13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    private void n(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12) {
        float fCenterX = f10 - rectF.centerX();
        float fCenterY = f11 - rectF.centerY();
        float f13 = rectF.left;
        if (f13 + fCenterX >= 0.0f) {
            float f14 = rectF.right;
            if (f14 + fCenterX > i10 || f13 + fCenterX < rectF2.left || f14 + fCenterX > rectF2.right) {
                fCenterX /= 1.05f;
                this.f35774f.x -= fCenterX / 2.0f;
            }
        } else {
            fCenterX /= 1.05f;
            this.f35774f.x -= fCenterX / 2.0f;
        }
        float f15 = rectF.top;
        if (f15 + fCenterY >= 0.0f) {
            float f16 = rectF.bottom;
            if (f16 + fCenterY > i11 || f15 + fCenterY < rectF2.top || f16 + fCenterY > rectF2.bottom) {
                fCenterY /= 1.05f;
                this.f35774f.y -= fCenterY / 2.0f;
            }
        } else {
            fCenterY /= 1.05f;
            this.f35774f.y -= fCenterY / 2.0f;
        }
        rectF.offset(fCenterX, fCenterY);
        q(rectF, rectF2, f12);
    }

    private void o(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12, float f13) {
        switch (a.f35775a[this.f35773e.ordinal()]) {
            case 1:
                if (k(f10, f11, rectF.right, rectF.bottom) >= f13) {
                    c(rectF, f10, rectF2, f12, f13, true, false);
                    j(rectF, f13);
                } else {
                    h(rectF, f11, rectF2, f12, f13, true, false);
                    d(rectF, f13);
                }
                break;
            case 2:
                if (k(rectF.left, f11, f10, rectF.bottom) >= f13) {
                    f(rectF, f10, rectF2, i10, f12, f13, true, false);
                    j(rectF, f13);
                } else {
                    h(rectF, f11, rectF2, f12, f13, false, true);
                    g(rectF, f13);
                }
                break;
            case 3:
                if (k(f10, rectF.top, rectF.right, f11) >= f13) {
                    c(rectF, f10, rectF2, f12, f13, false, true);
                    b(rectF, f13);
                } else {
                    a(rectF, f11, rectF2, i11, f12, f13, true, false);
                    d(rectF, f13);
                }
                break;
            case 4:
                if (k(rectF.left, rectF.top, f10, f11) >= f13) {
                    f(rectF, f10, rectF2, i10, f12, f13, false, true);
                    b(rectF, f13);
                } else {
                    a(rectF, f11, rectF2, i11, f12, f13, false, true);
                    g(rectF, f13);
                }
                break;
            case 5:
                c(rectF, f10, rectF2, f12, f13, true, true);
                i(rectF, rectF2, f13);
                break;
            case 6:
                h(rectF, f11, rectF2, f12, f13, true, true);
                e(rectF, rectF2, f13);
                break;
            case 7:
                f(rectF, f10, rectF2, i10, f12, f13, true, true);
                i(rectF, rectF2, f13);
                break;
            case 8:
                a(rectF, f11, rectF2, i11, f12, f13, true, true);
                e(rectF, rectF2, f13);
                break;
        }
    }

    private void p(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12) {
        switch (a.f35775a[this.f35773e.ordinal()]) {
            case 1:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 2:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 3:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 4:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 5:
                c(rectF, f10, rectF2, f12, 0.0f, false, false);
                break;
            case 6:
                h(rectF, f11, rectF2, f12, 0.0f, false, false);
                break;
            case 7:
                f(rectF, f10, rectF2, i10, f12, 0.0f, false, false);
                break;
            case 8:
                a(rectF, f11, rectF2, i11, f12, 0.0f, false, false);
                break;
        }
    }

    private void q(RectF rectF, RectF rectF2, float f10) {
        float f11 = rectF.left;
        float f12 = rectF2.left;
        if (f11 < f12 + f10) {
            rectF.offset(f12 - f11, 0.0f);
        }
        float f13 = rectF.top;
        float f14 = rectF2.top;
        if (f13 < f14 + f10) {
            rectF.offset(0.0f, f14 - f13);
        }
        float f15 = rectF.right;
        float f16 = rectF2.right;
        if (f15 > f16 - f10) {
            rectF.offset(f16 - f15, 0.0f);
        }
        float f17 = rectF.bottom;
        float f18 = rectF2.bottom;
        if (f17 > f18 - f10) {
            rectF.offset(0.0f, f18 - f17);
        }
    }

    public void m(RectF rectF, float f10, float f11, RectF rectF2, int i10, int i11, float f12, boolean z10, float f13) {
        PointF pointF = this.f35774f;
        float f14 = pointF.x + f10;
        float f15 = f11 + pointF.y;
        if (this.f35773e == b.CENTER) {
            n(rectF, f14, f15, rectF2, i10, i11, f12);
        } else if (z10) {
            o(rectF, f14, f15, rectF2, i10, i11, f12, f13);
        } else {
            p(rectF, f14, f15, rectF2, i10, i11, f12);
        }
    }
}
