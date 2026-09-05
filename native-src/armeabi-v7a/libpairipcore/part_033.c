// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 641-660
// ============================================================

// ============================================================
// Function #641
// Name: FUN_0007a00c
// Address: 0007a00c
// JNI: NO
// ============================================================


void FUN_0007a00c(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 uStack_1c;
  undefined4 *puStack_18;
  undefined4 uStack_14;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a08c + 0x7a024);
  puStack_18 = param_3 + 2;
  uStack_14 = *param_3;
  uStack_1c = param_2;
  local_10 = param_1;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&local_10,&uStack_14,&uStack_1c,&puStack_18);
  if (**(int **)(DAT_0007a090 + 0x7a074) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #642
// Name: FUN_0007a094
// Address: 0007a094
// JNI: NO
// ============================================================


void FUN_0007a094(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007a0bc + DAT_0007a0bc;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #643
// Name: FUN_0007a0f4
// Address: 0007a0f4
// JNI: NO
// ============================================================


void FUN_0007a0f4(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007a120. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #644
// Name: FUN_0007a124
// Address: 0007a124
// JNI: NO
// ============================================================


void FUN_0007a124(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007a150. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #645
// Name: FUN_0007a174
// Address: 0007a174
// JNI: NO
// ============================================================


void FUN_0007a174(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 uStack_1c;
  undefined4 *puStack_18;
  undefined4 uStack_14;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a1f4 + 0x7a18c);
  puStack_18 = param_3 + 2;
  uStack_14 = *param_3;
  uStack_1c = param_2;
  local_10 = param_1;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&local_10,&uStack_14,&uStack_1c,&puStack_18);
  if (**(int **)(DAT_0007a1f8 + 0x7a1dc) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #646
// Name: FUN_0007a1fc
// Address: 0007a1fc
// JNI: NO
// ============================================================


void FUN_0007a1fc(undefined4 param_1,undefined4 param_2,undefined4 *param_3,int *param_4)

{
  undefined4 *local_1c;
  undefined4 local_18;
  undefined4 local_14;
  undefined4 local_10;
  int local_c;
  
  local_c = **(int **)(DAT_0007a284 + 0x7a214);
  local_1c = param_3 + 2;
  local_10 = *param_3;
  local_18 = param_2;
  local_14 = param_1;
  if (param_4 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
    FUN_000269a8();
  }
  (**(code **)(*param_4 + 0x18))(param_4,&local_14,&local_10,&local_18,&local_1c);
  if (**(int **)(DAT_0007a288 + 0x7a26c) != local_c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #647
// Name: FUN_0007a7d4
// Address: 0007a7d4
// JNI: NO
// ============================================================


void FUN_0007a7d4(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007a7fc + DAT_0007a7fc;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #648
// Name: FUN_0007a828
// Address: 0007a828
// JNI: NO
// ============================================================


void FUN_0007a828(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007a854. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #649
// Name: FUN_0007a860
// Address: 0007a860
// JNI: NO
// ============================================================


void FUN_0007a860(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007a888 + DAT_0007a888;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #650
// Name: FUN_0007a8b8
// Address: 0007a8b8
// JNI: NO
// ============================================================


void FUN_0007a8b8(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007a8e0 + DAT_0007a8e0;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #651
// Name: FUN_0007a90c
// Address: 0007a90c
// JNI: NO
// ============================================================


void FUN_0007a90c(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007a938. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #652
// Name: FUN_0007a948
// Address: 0007a948
// JNI: NO
// ============================================================


void FUN_0007a948(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007a970 + DAT_0007a970;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #653
// Name: FUN_0007a99c
// Address: 0007a99c
// JNI: NO
// ============================================================


void FUN_0007a99c(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007a9c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #654
// Name: FUN_0007a9d8
// Address: 0007a9d8
// JNI: NO
// ============================================================


void FUN_0007a9d8(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007aa00 + DAT_0007aa00;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #655
// Name: FUN_0007aa24
// Address: 0007aa24
// JNI: NO
// ============================================================


void FUN_0007aa24(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007aa50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #656
// Name: FUN_0007aa60
// Address: 0007aa60
// JNI: NO
// ============================================================


void FUN_0007aa60(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007aa88 + DAT_0007aa88;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #657
// Name: FUN_0007aab4
// Address: 0007aab4
// JNI: NO
// ============================================================


void FUN_0007aab4(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007aae0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #658
// Name: FUN_0007aaf0
// Address: 0007aaf0
// JNI: NO
// ============================================================


void FUN_0007aaf0(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007ab18 + DAT_0007ab18;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #659
// Name: FUN_0007ab44
// Address: 0007ab44
// JNI: NO
// ============================================================


void FUN_0007ab44(int param_1,undefined4 *param_2,undefined4 *param_3,undefined4 *param_4,
                 undefined4 *param_5)

{
                    /* WARNING: Could not recover jumptable at 0x0007ab70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1 + 4))(*param_2,*param_3,*param_4,*param_5);
  return;
}




// ============================================================
// Function #660
// Name: FUN_0007ab80
// Address: 0007ab80
// JNI: NO
// ============================================================


void FUN_0007ab80(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0007aba8 + DAT_0007aba8;
  piVar1[1] = iVar2;
  return;
}




