package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface zzcp extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcs zzcsVar);

    void getAppInstanceId(zzcs zzcsVar);

    void getCachedAppInstanceId(zzcs zzcsVar);

    void getConditionalUserProperties(String str, String str2, zzcs zzcsVar);

    void getCurrentScreenClass(zzcs zzcsVar);

    void getCurrentScreenName(zzcs zzcsVar);

    void getGmpAppId(zzcs zzcsVar);

    void getMaxUserProperties(String str, zzcs zzcsVar);

    void getSessionId(zzcs zzcsVar);

    void getTestFlag(zzcs zzcsVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcs zzcsVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j10);

    void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j10, long j11);

    void isDataCollectionEnabled(zzcs zzcsVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcs zzcsVar, long j10);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10, long j11);

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j10);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j10);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10);

    void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j10);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j10);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcs zzcsVar, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j10);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j10);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j10);

    void performAction(Bundle bundle, zzcs zzcsVar, long j10);

    void registerOnMeasurementEventListener(zzcy zzcyVar);

    void resetAnalyticsData(long j10);

    void resetAnalyticsDataWithElapsedTime(long j10, long j11);

    void retrieveAndUploadBatches(zzcv zzcvVar);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzcy zzcyVar);

    void setInstanceIdProvider(zzda zzdaVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzcy zzcyVar);
}
