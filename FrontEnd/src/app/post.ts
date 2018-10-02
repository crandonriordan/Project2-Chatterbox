export interface Post {
    id: number,
    title: String,
    content: String,
    imageUrl: String,
    user: {
        id: String,
        nickname: String,
        groups: any[]
    },
    group: {
        id: number,
        name: String,
        users: any[]
    },
    votes: any[],
    comments: any[]
}