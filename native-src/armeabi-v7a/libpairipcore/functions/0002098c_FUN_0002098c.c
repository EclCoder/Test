/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002098c
 * Address  : 0002098c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0002098c(undefined4 *param_1,int param_2)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  int *piVar4;
  int iVar5;
  int iVar6;
  char *pcVar7;
  undefined4 uVar8;
  int local_70;
  int iStack_6c;
  int local_68;
  int iStack_64;
  int local_60;
  int local_5c;
  int local_58;
  int iStack_54;
  
  if (param_2 != 0) {
    param_1[0x54] = param_1[0x53];
  }
  iVar2 = FUN_0001bec0(param_1,DAT_00020c08 + 0x209ac,2);
  if (iVar2 != 0) {
    FUN_0001c5c0(&local_58,param_1,0);
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar3 != '_') {
      return (int *)0x0;
    }
    *param_1 = pcVar3 + 1;
    piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
    *(undefined1 *)(piVar4 + 1) = 0x33;
    *piVar4 = DAT_00020c0c + 0x209f0;
    piVar4[2] = local_58;
    piVar4[3] = iStack_54;
    *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
    return piVar4;
  }
  iVar2 = FUN_0001bec0(param_1,DAT_00020c10 + 0x20a0e,2);
  if (iVar2 == 0) {
    iVar2 = FUN_0001bec0(param_1,DAT_00020c28 + 0x20a6c,2);
    if (iVar2 == 0) {
      return (int *)0x0;
    }
    FUN_0001c5c0(&local_58,param_1,0);
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return (int *)0x0;
    }
    if (*pcVar3 != '_') {
      return (int *)0x0;
    }
    *param_1 = pcVar3 + 1;
    piVar4 = (int *)FUN_00021264(param_1,DAT_00020c2c + 0x20a9a);
    return piVar4;
  }
  uVar8 = param_1[0x62];
  param_1[0x62] = (int)(param_1[0x54] - param_1[0x53]) >> 2;
  iVar5 = FUN_00020f32(&local_58,param_1);
  piVar4 = param_1 + 2;
  iVar2 = param_1[3] - *piVar4 >> 2;
  while (iVar6 = FUN_00020f70(param_1), iVar6 != 0) {
    local_60 = FUN_00020fb0(param_1,iVar5 + 8);
    if (local_60 == 0) goto LAB_00020bc6;
    FUN_0001d7c0(piVar4,&local_60);
  }
  FUN_0001d830(&local_60,param_1,iVar2);
  if (local_5c == 0) {
    if (param_1[0x54] == param_1[0x53]) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b568(DAT_00020c14 + 0x20be8,DAT_00020c18 + 0x20bea,0x81,DAT_00020c1c + 0x20bec);
    }
    param_1[0x54] = param_1[0x54] + -4;
  }
  pcVar3 = (char *)*param_1;
  if ((pcVar3 == (char *)param_1[1]) || (*pcVar3 != 'Q')) {
    iVar5 = 0;
LAB_00020aee:
    iVar6 = FUN_0001bec0(param_1,DAT_00020c20 + 0x20af8,1);
    if (iVar6 == 0) {
      do {
        local_68 = FUN_0001c660(param_1);
        if (local_68 == 0) goto LAB_00020bc6;
        FUN_0001d7c0(piVar4,&local_68);
      } while (((char *)param_1[1] == (char *)*param_1) ||
              (cVar1 = *(char *)*param_1, cVar1 != 'Q' && cVar1 != 'E'));
    }
    FUN_0001d830(&local_68,param_1,iVar2);
    pcVar3 = (char *)*param_1;
    pcVar7 = (char *)param_1[1];
    if (pcVar3 != pcVar7) {
      if (*pcVar3 == 'Q') {
        *param_1 = pcVar3 + 1;
        iVar2 = FUN_0001d8c8(param_1);
        if (iVar2 == 0) goto LAB_00020bc6;
        pcVar3 = (char *)*param_1;
        pcVar7 = (char *)param_1[1];
      }
      else {
        iVar2 = 0;
      }
      if ((pcVar3 != pcVar7) && (*pcVar3 == 'E')) {
        *param_1 = pcVar3 + 1;
        piVar4 = (int *)0x0;
        FUN_0001c5c0(&local_70,param_1,0);
        pcVar3 = (char *)*param_1;
        if ((pcVar3 != (char *)param_1[1]) && (*pcVar3 == '_')) {
          *param_1 = pcVar3 + 1;
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x28);
          *(undefined1 *)(piVar4 + 1) = 0x34;
          *piVar4 = DAT_00020c24 + 0x20ba6;
          piVar4[9] = iStack_6c;
          piVar4[2] = local_60;
          piVar4[3] = local_5c;
          piVar4[4] = iVar5;
          piVar4[5] = local_68;
          piVar4[6] = iStack_64;
          piVar4[7] = iVar2;
          piVar4[8] = local_70;
          *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
        }
        goto LAB_00020bc8;
      }
    }
  }
  else {
    *param_1 = pcVar3 + 1;
    iVar5 = FUN_0001d8c8(param_1);
    if (iVar5 != 0) goto LAB_00020aee;
  }
LAB_00020bc6:
  piVar4 = (int *)0x0;
LAB_00020bc8:
  FUN_00021214(&local_58);
  param_1[0x62] = uVar8;
  return piVar4;
}


