interface AuthConfig {
  clientID: string;
  domain: string;
  callbackURL: string;
}

export const AUTH_CONFIG: AuthConfig = {
  clientID: 'IF8D1zNPN8yUQYa9qPqcCgkkpRo4DfQM',
  domain: 'project2-chatterbox.auth0.com',
  callbackURL: 'http://localhost:3000/callback'
};
