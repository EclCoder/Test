package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f28600b = Arrays.asList("+", "-", "*", "/", "%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28601a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f28601a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Double dValueOf;
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA == null || dA2 == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 45) {
                    if (iHashCode != 47) {
                        if (iHashCode != 42) {
                            if (iHashCode == 43 && str.equals("+")) {
                                dValueOf = Double.valueOf(dA.doubleValue() + dA2.doubleValue());
                            } else {
                                dValueOf = null;
                            }
                        } else if (str.equals("*")) {
                            dValueOf = Double.valueOf(dA.doubleValue() * dA2.doubleValue());
                        } else {
                            dValueOf = null;
                        }
                    } else if (!str.equals("/")) {
                        dValueOf = null;
                    } else {
                        if (dA2.doubleValue() == 0.0d) {
                            throw new ArithmeticException("Division by zero");
                        }
                        dValueOf = Double.valueOf(new BigDecimal(dA.doubleValue()).divide(new BigDecimal(dA2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                    }
                } else if (str.equals("-")) {
                    dValueOf = Double.valueOf(dA.doubleValue() - dA2.doubleValue());
                } else {
                    dValueOf = null;
                }
            } else if (!str.equals("%")) {
                dValueOf = null;
            } else {
                if (dA2.doubleValue() == 0.0d) {
                    throw new ArithmeticException("Modulo by zero");
                }
                dValueOf = Double.valueOf(dA.doubleValue() % dA2.doubleValue());
            }
        } catch (Exception e10) {
            q0.b("BasicArithmeticOperator", e10.getMessage());
        }
        if (dValueOf == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        double dDoubleValue = dValueOf.doubleValue();
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(dDoubleValue) ? Integer.valueOf(dValueOf.intValue()) : Double.valueOf(b(dDoubleValue)));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f28600b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return b(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Double a(Object obj) {
        if (obj == null) {
            return Double.valueOf(0.0d);
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private boolean a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10) || d10 != Math.floor(d10)) ? false : true;
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
