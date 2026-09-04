/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00022e58
 * Address  : 00022e58
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_00022e58(int *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  ushort uVar1;
  char *pcVar2;
  int iVar3;
  int *piVar4;
  int *piVar5;
  int unaff_r4;
  int unaff_r5;
  int unaff_r6;
  int iVar6;
  
  pcVar2 = (char *)*param_1;
  if ((pcVar2 == (char *)param_1[1]) || (*pcVar2 != 'U')) {
    iVar3 = FUN_0001e1a4(param_1);
    piVar4 = (int *)FUN_0001c660(param_1);
    if (piVar4 != (int *)0x0) {
      if (iVar3 == 0) {
        return piVar4;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      uVar1 = *(ushort *)((int)piVar4 + 5);
      FUN_0001e9c0(piVar5,3,(byte)uVar1 >> 6,(uVar1 & 0x3ff) >> 8,(uVar1 & 0xfff) >> 10);
      piVar5[2] = iVar3;
      piVar5[3] = (int)piVar4;
      *piVar5 = DAT_00022fb0 + 0x22f38;
      return piVar5;
    }
  }
  else {
    *param_1 = (int)(pcVar2 + 1);
    FUN_000224c2(&stack0xffffffd8,param_1,param_3,param_4,param_3,param_4);
    if (&stack0xfffffff8 != (undefined1 *)0x0) {
      iVar3 = FUN_0001d2b8(unaff_r6,&stack0xfffffff8,DAT_00022fa4 + 0x22e92,9);
      if (iVar3 == 0) {
        if (((char *)param_1[1] == (char *)*param_1) || (*(char *)*param_1 != 'I')) {
          iVar3 = 0;
        }
        else {
          iVar3 = FUN_0001df74(param_1,0);
          if (iVar3 == 0) {
            return (int *)0x0;
          }
        }
        iVar6 = FUN_00022e58(param_1);
        if (iVar6 != 0) {
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x18);
          *(undefined1 *)(piVar4 + 1) = 2;
          piVar4[2] = iVar6;
          piVar4[3] = unaff_r6;
          piVar4[4] = (int)&stack0xfffffff8;
          piVar4[5] = iVar3;
          iVar3 = DAT_00022fac + 0x22f82;
          goto LAB_00022f80;
        }
      }
      else {
        iVar3 = *param_1;
        iVar6 = param_1[1];
        *param_1 = unaff_r6 + 9;
        param_1[1] = (int)(&stack0xfffffff8 + unaff_r6);
        FUN_000224c2(&stack0xffffffd0,param_1);
        *param_1 = iVar3;
        param_1[1] = iVar6;
        if ((unaff_r5 != 0) && (iVar3 = FUN_00022e58(param_1), iVar3 != 0)) {
          piVar4 = (int *)FUN_0001dbc0(param_1 + 0x66,0x14);
          *(undefined1 *)(piVar4 + 1) = 0xb;
          piVar4[2] = iVar3;
          piVar4[3] = unaff_r4;
          piVar4[4] = unaff_r5;
          iVar3 = DAT_00022fa8 + 0x22ee6;
LAB_00022f80:
          *piVar4 = iVar3 + 8;
          *(ushort *)((int)piVar4 + 5) = (*(ushort *)((int)piVar4 + 5) & 0xf000) + 0x540;
          return piVar4;
        }
      }
    }
  }
  return (int *)0x0;
}


