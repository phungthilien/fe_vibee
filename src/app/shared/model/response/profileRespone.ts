import { BaseResponse } from '../../../../../../../../vibee-fe-aws/fe_vibee/src/app/shared/model/response/BaseResponse';
export class ProfileRespone extends BaseResponse {
    fullname!: string;
    cccd!: string;
    address!: string;
    numberPhone! : string;
    email!: string;
}
