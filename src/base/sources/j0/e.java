package j0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import fl.q;
import java.io.Serializable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Bundle a(q... qVarArr) {
        Bundle bundle = new Bundle(qVarArr.length);
        for (q qVar : qVarArr) {
            String str = (String) qVar.d();
            Object objG = qVar.g();
            if (objG == null) {
                bundle.putString(str, null);
            } else if (objG instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objG).booleanValue());
            } else if (objG instanceof Byte) {
                bundle.putByte(str, ((Number) objG).byteValue());
            } else if (objG instanceof Character) {
                bundle.putChar(str, ((Character) objG).charValue());
            } else if (objG instanceof Double) {
                bundle.putDouble(str, ((Number) objG).doubleValue());
            } else if (objG instanceof Float) {
                bundle.putFloat(str, ((Number) objG).floatValue());
            } else if (objG instanceof Integer) {
                bundle.putInt(str, ((Number) objG).intValue());
            } else if (objG instanceof Long) {
                bundle.putLong(str, ((Number) objG).longValue());
            } else if (objG instanceof Short) {
                bundle.putShort(str, ((Number) objG).shortValue());
            } else if (objG instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objG);
            } else if (objG instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objG);
            } else if (objG instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objG);
            } else if (objG instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objG);
            } else if (objG instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objG);
            } else if (objG instanceof char[]) {
                bundle.putCharArray(str, (char[]) objG);
            } else if (objG instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objG);
            } else if (objG instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objG);
            } else if (objG instanceof int[]) {
                bundle.putIntArray(str, (int[]) objG);
            } else if (objG instanceof long[]) {
                bundle.putLongArray(str, (long[]) objG);
            } else if (objG instanceof short[]) {
                bundle.putShortArray(str, (short[]) objG);
            } else if (objG instanceof Object[]) {
                Class<?> componentType = objG.getClass().getComponentType();
                s.e(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    s.f(objG, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objG);
                } else if (String.class.isAssignableFrom(componentType)) {
                    s.f(objG, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objG);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    s.f(objG, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objG);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objG);
                }
            } else if (objG instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objG);
            } else if (objG instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objG);
            } else if (objG instanceof Size) {
                bundle.putSize(str, (Size) objG);
            } else {
                if (!(objG instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objG.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) objG);
            }
        }
        return bundle;
    }
}
