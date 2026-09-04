/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020fb0
 * Address  : 00020fb0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00020fb0(undefined4 *param_1,undefined4 param_2)

{
  undefined1 uVar1;
  int iVar2;
  int *piVar3;
  int iVar4;
  char *pcVar5;
  char *pcVar6;
  int iVar7;
  int iVar8;
  int local_68;
  int iStack_64;
  undefined1 auStack_60 [52];
  undefined4 *local_2c;
  undefined4 *puStack_28;
  undefined4 local_24;
  
  puStack_28 = &local_24;
  local_2c = param_1;
  local_24 = param_2;
  iVar2 = FUN_0001bec0(param_1,DAT_000211ec + 0x20fce,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_000211f4 + 0x2100e,2);
    if (iVar2 != 0) {
      uVar1 = *(undefined1 *)((int)param_1 + 0x186);
      *(undefined1 *)((int)param_1 + 0x186) = 1;
      iVar2 = FUN_0001d34c(param_1,0);
      if (iVar2 == 0) {
        piVar3 = (int *)0x0;
      }
      else {
        iVar4 = FUN_00021308(&local_2c,0);
        piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
        FUN_0001e9c0(piVar3,0x24,0,1,1);
        piVar3[2] = iVar2;
        piVar3[3] = iVar4;
        *piVar3 = DAT_000211f8 + 0x21064;
      }
      *(undefined1 *)((int)param_1 + 0x186) = uVar1;
      return piVar3;
    }
    iVar2 = FUN_0001bec0(param_1,DAT_000211fc + 0x2106a,2);
    if (iVar2 == 0) {
      iVar2 = FUN_0001bec0(param_1,DAT_00021204 + 0x210b6,2);
      if (iVar2 != 0) {
        iVar2 = FUN_00021308(&local_2c,2);
        iVar8 = param_1[3];
        iVar7 = param_1[2];
        iVar4 = FUN_00020f32(auStack_60,param_1);
        pcVar5 = (char *)*param_1;
        pcVar6 = (char *)param_1[1];
        do {
          if ((pcVar5 != pcVar6) && (*pcVar5 == 'E')) {
            iVar4 = 0;
            goto LAB_00021186;
          }
          local_68 = FUN_00020fb0(param_1,iVar4 + 8);
          if (local_68 == 0) goto LAB_00021134;
          FUN_0001d7c0(param_1 + 2,&local_68);
          pcVar5 = (char *)*param_1;
          pcVar6 = (char *)param_1[1];
        } while ((pcVar5 == pcVar6) || (*pcVar5 != 'Q'));
        *param_1 = pcVar5 + 1;
        iVar4 = FUN_0001d8c8(param_1);
        if ((iVar4 == 0) ||
           ((pcVar5 = (char *)*param_1, pcVar5 == (char *)param_1[1] || (*pcVar5 != 'E')))) {
LAB_00021134:
          piVar3 = (int *)0x0;
        }
        else {
LAB_00021186:
          *param_1 = pcVar5 + 1;
          FUN_0001d830(&local_68,param_1,iVar8 - iVar7 >> 2);
          piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x18);
          iVar7 = local_68;
          FUN_0001e9c0(piVar3,0x26,0,1,1);
          piVar3[2] = iVar2;
          piVar3[3] = iVar7;
          piVar3[4] = iStack_64;
          piVar3[5] = iVar4;
          *piVar3 = DAT_00021208 + 0x211ca;
        }
        FUN_00021214(auStack_60);
        return piVar3;
      }
      iVar2 = FUN_0001bec0(param_1,DAT_0002120c + 0x2114a,2);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      iVar2 = FUN_00020fb0(param_1,local_24);
      if (iVar2 == 0) {
        return (int *)0x0;
      }
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
      FUN_0001e9c0(piVar3,0x27,0,1,1);
      piVar3[2] = iVar2;
      iVar2 = DAT_00021210 + 0x2117e;
    }
    else {
      iVar2 = FUN_00021308(&local_2c,1);
      iVar4 = FUN_0001c660(param_1);
      if (iVar4 == 0) {
        return (int *)0x0;
      }
      piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      FUN_0001e9c0(piVar3,0x25,0,1,1);
      piVar3[2] = iVar2;
      piVar3[3] = iVar4;
      iVar2 = DAT_00021200 + 0x210ac;
    }
  }
  else {
    iVar2 = FUN_00021308(&local_2c,0);
    piVar3 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
    FUN_0001e9c0(piVar3,0x23,0,1,1);
    piVar3[2] = iVar2;
    iVar2 = DAT_000211f0 + 0x21000;
  }
  *piVar3 = iVar2 + 8;
  return piVar3;
}


