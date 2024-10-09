import axios from 'axios';

const API_URL = 'http://localhost:8082/pasakumi/all';

class UserService {
    getAllPasakumi() {
        return axios.get(API_URL);
    }
}

export default new UserService();
