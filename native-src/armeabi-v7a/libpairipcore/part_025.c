// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 481-500
// ============================================================

// ============================================================
// Function #481
// Name: FUN_000256ac
// Address: 000256ac
// JNI: NO
// ============================================================


void FUN_000256ac(undefined8 *param_1)

{
  undefined8 in_d16;
  undefined8 in_d17;
  undefined8 in_d18;
  undefined8 in_d19;
  undefined8 in_d20;
  undefined8 in_d21;
  undefined8 in_d22;
  undefined8 in_d23;
  undefined8 in_d24;
  undefined8 in_d25;
  undefined8 in_d26;
  undefined8 in_d27;
  undefined8 in_d28;
  undefined8 in_d29;
  undefined8 in_d30;
  undefined8 in_d31;
  
  *param_1 = in_d16;
  param_1[1] = in_d17;
  param_1[2] = in_d18;
  param_1[3] = in_d19;
  param_1[4] = in_d20;
  param_1[5] = in_d21;
  param_1[6] = in_d22;
  param_1[7] = in_d23;
  param_1[8] = in_d24;
  param_1[9] = in_d25;
  param_1[10] = in_d26;
  param_1[0xb] = in_d27;
  param_1[0xc] = in_d28;
  param_1[0xd] = in_d29;
  param_1[0xe] = in_d30;
  param_1[0xf] = in_d31;
  return;
}




// ============================================================
// Function #482
// Name: FUN_000256c8
// Address: 000256c8
// JNI: NO
// ============================================================


undefined4 FUN_000256c8(undefined8 *param_1)

{
  return (int)*param_1;
}




// ============================================================
// Function #483
// Name: FUN_000256d0
// Address: 000256d0
// JNI: NO
// ============================================================


undefined4 FUN_000256d0(undefined8 *param_1)

{
  return (int)*param_1;
}




// ============================================================
// Function #484
// Name: FUN_000256e0
// Address: 000256e0
// JNI: NO
// ============================================================


ushort * FUN_000256e0(uint param_1)

{
  int iVar1;
  int iVar2;
  ushort *puVar3;
  ushort *puVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  undefined4 unaff_r6;
  ushort *puVar9;
  pthread_mutex_t *local_24;
  
  if (param_1 < 2) {
    param_1 = 1;
  }
  puVar3 = (ushort *)FUN_00023f80(0x10,param_1);
  iVar1 = DAT_000257e4;
  if (puVar3 != (ushort *)0x0) {
    return puVar3;
  }
  local_24 = (pthread_mutex_t *)(DAT_000257e4 + 0x25714);
  pthread_mutex_lock(local_24);
  iVar2 = DAT_000257e8;
  puVar3 = *(ushort **)(iVar1 + 0x25718);
  iVar8 = DAT_000257e8 + 0x25726;
  if (puVar3 == (ushort *)0x0) {
    puVar3 = (ushort *)(DAT_000257e8 + 0x25732);
    *(undefined4 *)puVar3 = DAT_000257e0;
    *(ushort **)(iVar1 + 0x25718) = puVar3;
  }
  uVar5 = (param_1 + 3 >> 2) + 1;
  puVar9 = (ushort *)0x0;
  do {
    puVar4 = puVar3;
    if (puVar4 == (ushort *)(&UNK_00025926 + iVar2)) {
      puVar3 = (ushort *)0x0;
LAB_000257b4:
      FUN_000258cc(&local_24);
      return puVar3;
    }
    puVar3 = puVar4 + 2;
    if (((uint)puVar3 & 0xf) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_000257ec + 0x257ce,DAT_000257f0 + 0x257d0,0x92,DAT_000257f4 + 0x257d2,
                   unaff_r6);
    }
    uVar6 = (uint)puVar4[1];
    uVar7 = uVar5;
    if (uVar5 <= uVar6 && uVar6 - uVar5 != 0) {
      uVar7 = uVar5 + (uVar6 - uVar5 & 3);
    }
    if (uVar7 < uVar6) {
      uVar5 = uVar6 - uVar7 & 0xffff;
      puVar4[1] = (ushort)(uVar6 - uVar7);
      puVar4[uVar5 * 2] = 0;
      puVar3 = puVar4 + uVar5 * 2 + 2;
      puVar4[uVar5 * 2 + 1] = (ushort)uVar7;
      if (((uint)puVar3 & 0xf) != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_000257f8 + 0x25796,DAT_000257fc + 0x25798,0xa7,DAT_00025800 + 0x2579a,
                     unaff_r6);
      }
      goto LAB_000257b4;
    }
    if (param_1 + 3 >> 2 < uVar6) {
      if (puVar9 == (ushort *)0x0) {
        *(uint *)(iVar1 + 0x25718) = iVar8 + (uint)*puVar4 * 4;
      }
      else {
        *puVar9 = *puVar4;
      }
      *puVar4 = 0;
      goto LAB_000257b4;
    }
    puVar3 = (ushort *)(iVar8 + (uint)*puVar4 * 4);
    puVar9 = puVar4;
  } while( true );
}




// ============================================================
// Function #485
// Name: FUN_00025804
// Address: 00025804
// JNI: NO
// ============================================================


void FUN_00025804(undefined *param_1)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort uVar4;
  int iVar5;
  ushort *puVar6;
  ushort *puVar7;
  ushort *puVar8;
  pthread_mutex_t *local_24;
  
  iVar1 = DAT_000258c4;
  if ((param_1 < (undefined *)(DAT_00025828 + 0x2580e)) || (&UNK_00025a0e + DAT_00025828 <= param_1)
     ) {
    (*(code *)PTR_free_000a5f80)();
    return;
  }
  local_24 = (pthread_mutex_t *)(DAT_000258c4 + 0x2583c);
  pthread_mutex_lock(local_24);
  puVar7 = *(ushort **)(iVar1 + 0x25840);
  puVar3 = (ushort *)(param_1 + -4);
  iVar5 = DAT_000258c8 + 0x25856;
  puVar2 = puVar7;
  puVar8 = (ushort *)0x0;
  do {
    puVar6 = puVar2;
    if ((puVar6 == (ushort *)0x0) || (puVar6 == (ushort *)(&UNK_00025a56 + DAT_000258c8))) {
      *(ushort **)(iVar1 + 0x25840) = puVar3;
      uVar4 = (ushort)((uint)((int)puVar7 - iVar5) >> 2);
LAB_000258b4:
      *puVar3 = uVar4;
LAB_000258b6:
      FUN_000258cc(&local_24);
      return;
    }
    uVar4 = puVar6[1];
    if (puVar6 + (uint)uVar4 * 2 == puVar3) {
      puVar6[1] = *(short *)(param_1 + -2) + uVar4;
      goto LAB_000258b6;
    }
    if (puVar3 + (uint)*(ushort *)(param_1 + -2) * 2 == puVar6) {
      *(ushort *)(param_1 + -2) = *(ushort *)(param_1 + -2) + uVar4;
      if (puVar8 != (ushort *)0x0) {
        *puVar8 = (ushort)((uint)((int)puVar3 - iVar5) >> 2);
        goto LAB_000258b6;
      }
      *(ushort **)(iVar1 + 0x25840) = puVar3;
      uVar4 = *puVar6;
      goto LAB_000258b4;
    }
    puVar2 = (ushort *)(iVar5 + (uint)*puVar6 * 4);
    puVar8 = puVar6;
  } while( true );
}




// ============================================================
// Function #486
// Name: FUN_000258cc
// Address: 000258cc
// JNI: NO
// ============================================================


undefined4 * FUN_000258cc(undefined4 *param_1)

{
  pthread_mutex_unlock((pthread_mutex_t *)*param_1);
  return param_1;
}




// ============================================================
// Function #487
// Name: FUN_00025c9e
// Address: 00025c9e
// JNI: NO
// ============================================================


void FUN_00025c9e(int param_1,int param_2)

{
  FUN_00024006(param_2);
  if (param_1 != 0) {
    FUN_0001b2d4(*(undefined4 *)(param_2 + -0x14));
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #488
// Name: FUN_00025d04
// Address: 00025d04
// JNI: NO
// ============================================================


uint * FUN_00025d04(undefined4 *param_1,uint param_2)

{
  uint *puVar1;
  uint uVar2;
  ushort *puVar3;
  ushort *local_1c;
  
  if (param_2 == 0xff) {
    return (uint *)0x0;
  }
  puVar3 = (ushort *)*param_1;
  local_1c = puVar3;
  switch(param_2 & 0xf) {
  case 0:
  case 3:
  case 0xb:
    local_1c = puVar3 + 2;
    puVar1 = *(uint **)puVar3;
    break;
  case 1:
    puVar1 = (uint *)FUN_00025d9e(&local_1c);
    break;
  case 2:
    local_1c = puVar3 + 1;
    puVar1 = (uint *)(uint)*puVar3;
    break;
  case 4:
  case 0xc:
    local_1c = puVar3 + 4;
    puVar1 = *(uint **)puVar3;
    break;
  default:
                    /* WARNING: Subroutine does not return */
    abort();
  case 9:
    puVar1 = (uint *)FUN_00025e0c(&local_1c);
    break;
  case 10:
    local_1c = puVar3 + 1;
    puVar1 = (uint *)(int)(short)*puVar3;
  }
  uVar2 = (param_2 & 0x7f) >> 4;
  if ((uVar2 == 0) || (uVar2 == 3)) {
LAB_00025d6a:
    if (puVar1 != (uint *)0x0) {
      if (0x7fffffff < (uint)(int)(char)param_2) {
        puVar1 = (uint *)*puVar1;
      }
      goto LAB_00025d7a;
    }
  }
  else {
    if (uVar2 != 1) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if (puVar1 != (uint *)0x0) {
      puVar1 = (uint *)((int)puVar1 + (int)puVar3);
      goto LAB_00025d6a;
    }
  }
  puVar1 = (uint *)0x0;
LAB_00025d7a:
  *param_1 = local_1c;
  return puVar1;
}




// ============================================================
// Function #489
// Name: FUN_00025d9e
// Address: 00025d9e
// JNI: NO
// ============================================================


uint FUN_00025d9e(undefined4 *param_1)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  char *pcVar4;
  uint uVar6;
  char *pcVar5;
  
  uVar6 = 0;
  uVar3 = 0;
  pcVar5 = (char *)*param_1;
  do {
    pcVar4 = pcVar5 + 1;
    cVar1 = *pcVar5;
    uVar2 = uVar6 & 0xff;
    uVar6 = uVar6 + 7;
    uVar3 = uVar3 | ((int)cVar1 & 0x7fU) << uVar2;
    pcVar5 = pcVar4;
  } while (cVar1 < 0);
  *param_1 = pcVar4;
  return uVar3;
}




// ============================================================
// Function #490
// Name: FUN_00025dc0
// Address: 00025dc0
// JNI: NO
// ============================================================


bool FUN_00025dc0(uint param_1,undefined4 param_2,int param_3,undefined4 param_4,undefined1 *param_5
                 ,undefined4 param_6)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  int *piVar4;
  undefined1 *local_24;
  
  local_24 = &stack0xfffffff8;
  if (param_3 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_00025c9e(0,param_6);
  }
  piVar3 = (int *)(param_3 + ~param_1 * 4);
  piVar4 = piVar3;
  do {
    iVar2 = *piVar4;
    if (iVar2 == 0) break;
    local_24 = param_5;
    iVar1 = (**(code **)(**(int **)((int)piVar3 + iVar2) + 0x10))
                      (*(int **)((int)piVar3 + iVar2),param_4,&local_24);
    piVar3 = piVar3 + 1;
    piVar4 = piVar4 + 1;
  } while (iVar1 == 0);
  return iVar2 == 0;
}




// ============================================================
// Function #491
// Name: FUN_00025e0c
// Address: 00025e0c
// JNI: NO
// ============================================================


uint FUN_00025e0c(undefined4 *param_1)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte *pbVar5;
  byte *pbVar6;
  
  uVar4 = 0;
  uVar3 = 0;
  pbVar6 = (byte *)*param_1;
  do {
    pbVar5 = pbVar6 + 1;
    bVar1 = *pbVar6;
    uVar2 = uVar4 & 0xff;
    uVar4 = uVar4 + 7;
    uVar3 = uVar3 | ((int)(char)bVar1 & 0x7fU) << uVar2;
    pbVar6 = pbVar5;
  } while ((char)bVar1 < 0);
  *param_1 = pbVar5;
  uVar2 = uVar3;
  if (uVar4 < 0x20) {
    uVar2 = uVar3 | -1 << (uVar4 & 0xff);
  }
  if (bVar1 < 0x40) {
    uVar2 = uVar3;
  }
  return uVar2;
}




// ============================================================
// Function #492
// Name: FUN_00025e44
// Address: 00025e44
// JNI: NO
// ============================================================


int FUN_00025e44(int param_1)

{
  longlong lVar1;
  
  lVar1 = FUN_00023fa6();
  if (lVar1 == CONCAT44(DAT_00025e64,DAT_00025e68)) {
    param_1 = *(int *)(param_1 + -0x24);
  }
  else {
    param_1 = param_1 + 0x58;
  }
  return param_1;
}




// ============================================================
// Function #493
// Name: FUN_00025e6c
// Address: 00025e6c
// JNI: NO
// ============================================================


void * FUN_00025e6c(size_t *param_1)

{
  undefined4 *__ptr;
  void *pvVar1;
  uint uVar2;
  void *__s;
  int iVar3;
  size_t __n;
  uint uVar4;
  
  iVar3 = DAT_00025f7c;
  uVar4 = param_1[2];
  DataMemoryBarrier(0x1b);
  if (uVar4 == 0) {
    pthread_once((pthread_once_t *)(DAT_00025f7c + 0x25e8a),
                 (__init_routine *)(DAT_00025f80 + 0x25e88));
    pthread_mutex_lock((pthread_mutex_t *)(iVar3 + 0x25e8e));
    uVar4 = param_1[2];
    if (uVar4 == 0) {
      uVar4 = *(int *)(iVar3 + 0x25e86) + 1;
      *(uint *)(iVar3 + 0x25e86) = uVar4;
      DataMemoryBarrier(0x1b);
      param_1[2] = uVar4;
    }
    pthread_mutex_unlock((pthread_mutex_t *)(iVar3 + 0x25e8e));
  }
  __ptr = pthread_getspecific(*(pthread_key_t *)(iVar3 + 0x25e82));
  if (__ptr == (undefined4 *)0x0) {
    iVar3 = (uVar4 + 0x11 & 0xfffffff0) - 2;
    __ptr = malloc(iVar3 * 4 + 8);
    if (__ptr != (undefined4 *)0x0) {
      memset(__ptr + 2,0,iVar3 * 4);
      *__ptr = 1;
    }
  }
  else {
    uVar2 = __ptr[1];
    if (uVar4 <= uVar2) goto LAB_00025f1a;
    iVar3 = (uVar4 + 0x11 & 0xfffffff0) - 2;
    __ptr = realloc(__ptr,iVar3 * 4 + 8);
    if (__ptr != (undefined4 *)0x0) {
      memset(__ptr + uVar2 + 2,0,(iVar3 - uVar2) * 4);
    }
  }
  FUN_00026010(__ptr,iVar3);
LAB_00025f1a:
  __s = (void *)__ptr[uVar4 + 1];
  if (__s == (void *)0x0) {
    uVar2 = param_1[1];
    if (uVar2 < 5) {
      uVar2 = 4;
    }
    if ((uVar2 & uVar2 - 1) != 0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    __n = *param_1;
    pvVar1 = malloc(uVar2 + 3 + __n);
    if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    __s = (void *)((int)pvVar1 + uVar2 + 3 & -uVar2);
    *(void **)((int)__s + -4) = pvVar1;
    if ((void *)param_1[3] == (void *)0x0) {
      memset(__s,0,__n);
    }
    else {
      memcpy(__s,(void *)param_1[3],__n);
    }
    __ptr[uVar4 + 1] = __s;
  }
  return __s;
}




// ============================================================
// Function #494
// Name: FUN_00025fa0
// Address: 00025fa0
// JNI: NO
// ============================================================


void FUN_00025fa0(void)

{
  int iVar1;
  undefined1 *puVar2;
  
  puVar2 = (undefined1 *)(DAT_00025fbc + 0x25faa);
  iVar1 = pthread_key_create((pthread_key_t *)(DAT_00025fbc + 0x25fae),
                             (__destr_function *)(DAT_00025fc0 + 0x25fae));
  if (iVar1 == 0) {
    *puVar2 = 1;
    return;
  }
                    /* WARNING: Subroutine does not return */
  abort();
}




// ============================================================
// Function #495
// Name: FUN_00025fc4
// Address: 00025fc4
// JNI: NO
// ============================================================


void FUN_00025fc4(int *param_1)

{
  uint uVar1;
  
  if (*param_1 == 0) {
    for (uVar1 = 0; uVar1 < (uint)param_1[1]; uVar1 = uVar1 + 1) {
      if (param_1[uVar1 + 2] != 0) {
        free(*(void **)(param_1[uVar1 + 2] + -4));
      }
    }
    (*(code *)PTR_free_000a5f80)(param_1);
    return;
  }
  *param_1 = *param_1 + -1;
  (*(code *)PTR_pthread_setspecific_000a5f24)
            (*(undefined4 *)((int)&DAT_0002600c + DAT_0002600c),param_1);
  return;
}




// ============================================================
// Function #496
// Name: FUN_00026010
// Address: 00026010
// JNI: NO
// ============================================================


void FUN_00026010(int param_1,undefined4 param_2)

{
  if (param_1 == 0) {
                    /* WARNING: Subroutine does not return */
    abort();
  }
  *(undefined4 *)(param_1 + 4) = param_2;
  (*(code *)PTR_pthread_setspecific_000a5f24)
            (*(undefined4 *)((int)&DAT_0002600c + DAT_0002600c),param_1);
  return;
}




// ============================================================
// Function #497
// Name: FUN_00026020
// Address: 00026020
// JNI: NO
// ============================================================


void FUN_00026020(void)

{
  FUN_00026272();
  return;
}




// ============================================================
// Function #498
// Name: FUN_00026034
// Address: 00026034
// JNI: NO
// ============================================================


void FUN_00026034(void)

{
  FUN_000262cc();
  return;
}




// ============================================================
// Function #499
// Name: FUN_00026048
// Address: 00026048
// JNI: NO
// ============================================================


int FUN_00026048(uint param_1,uint param_2)

{
  uint uVar1;
  uint uVar2;
  
  uVar2 = FUN_00026070((param_1 ^ (int)param_1 >> 0x1f) - ((int)param_1 >> 0x1f),
                       (param_2 ^ (int)param_2 >> 0x1f) - ((int)param_2 >> 0x1f));
  uVar1 = (int)(param_1 ^ param_2) >> 0x1f;
  return (uVar2 ^ uVar1) - uVar1;
}




// ============================================================
// Function #500
// Name: FUN_00026070
// Address: 00026070
// JNI: NO
// ============================================================


void FUN_00026070(uint param_1,uint param_2)

{
  if (param_2 == 0) {
    FUN_00026270(0);
    return;
  }
  if (param_2 != 1) {
    if (param_2 <= param_1) {
                    /* WARNING: Could not recover jumptable at 0x000260a0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_0002625f + (LZCOUNT(param_2) - LZCOUNT(param_1)) * -0xe))();
      return;
    }
    return;
  }
  return;
}




