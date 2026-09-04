package com.google.android.gms.tasks;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j10) {
        this.zza = j10;
    }

    public static void createAndAddCallback(Task<Object> task, long j10) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j10));
    }

    public native void nativeOnComplete(long j10, Object obj, boolean z10, boolean z11, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
